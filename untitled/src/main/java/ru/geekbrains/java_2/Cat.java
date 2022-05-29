package ru.geekbrains.java_2;

public class Cat {
    String name;
    int maxJump;
    int maxRun;

    public Cat(String name, int maxJump, int maxRun) {
        this.name = name;
        this.maxJump = maxJump;
        this.maxRun = maxRun;

    }
    Cat cat = new Cat("Barsik",5,10);
    Cat cat1 = new Cat("Tiger",6,12);
}
