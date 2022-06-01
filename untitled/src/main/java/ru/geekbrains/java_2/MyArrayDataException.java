package ru.geekbrains.java_2;

public class MyArrayDataException extends RuntimeException {
    MyArrayDataException(String msg) {
        super("Ошибка преобразования элемента массива в целое число.\n" + " " + msg);
    }
}
