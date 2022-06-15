//Написать консольный вариант клиент\серверного приложения, в котором пользователь может писать сообщения,
// как на клиентской стороне, так и на серверной. Т.е. если на клиентской стороне написать
// "Привет", нажать Enter то сообщение должно передаться на сервер и там отпечататься в консоли.
// Если сделать то же самое на серверной стороне, сообщение соответственно передается клиенту и
// печатается у него в консоли. Есть одна особенность, которую нужно учитывать: клиент или сервер
// может написать несколько сообщений подряд, такую ситуацию необходимо корректно обработать
//Разобраться с кодом с занятия, он является фундаментом проекта-чата
//ВАЖНО! Сервер общается только с одним клиентом, т.е. не нужно запускать цикл, который будет
// ожидать второго/третьего/n-го клиентов
package ru.geekbrains.java_2;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server {
    public static void main(String[] args) {
        Server server = new Server();
        server.startServer();

    }
    public void startServer(){
        try(ServerSocket serverSocket = new ServerSocket(8198)){
            System.out.println("Сервер запущен, ожидаем подключения...");
            final Socket socket = serverSocket.accept();
            System.out.println("Клиент подключился");
            final DataInputStream in = new DataInputStream(socket.getInputStream());
            final DataOutputStream out = new DataOutputStream(socket.getOutputStream());
            new Thread(() -> {
                while (true) {
                    String message = null;
                    try {
                        message = in.readUTF();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    if ("/end".equalsIgnoreCase(message)) {
                        try {
                            out.writeUTF("Сервер закончил работу");
                            out.writeUTF("/end");
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                        System.out.println("Сервер закончил работу");
                        break;
                    }
                    System.out.println("Сообщение от клиента: " + message);
                }
            }).start();
            Thread serverWrite;
            serverWrite = new Thread(() -> {
                while (true) {
                    Scanner scanner = new Scanner(System.in);
                    try {
                        out.writeUTF(scanner.nextLine());
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            });
            serverWrite.setDaemon(true);
            serverWrite.start();

        } catch(
                IOException e)

        {
            e.printStackTrace();
        }
    }


}