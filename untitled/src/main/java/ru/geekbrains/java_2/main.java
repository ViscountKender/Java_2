package ru.geekbrains.java_2;

public class  main  {

    public static void main(String[] args) {
        Task1 task1 = new Task1();
        task1.task1();
        System.out.println();

        Phonebook phonebook = new Phonebook();
        phonebook.add("Петров", "+79301111");
        phonebook.add("Иванов", "+79302222");
        phonebook.add("Сидоров", "+79300000");
        phonebook.add("Кузнецова", "+79303333");
        phonebook.add("Иванов", "+79304444");
        phonebook.get("Иванов");

    }

}
