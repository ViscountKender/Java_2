package ru.geekbrains.java_2;

public class Human {
    String name;
    int maxJump;
    int maxRun;

    public Human(String name, int maxJump, int maxRun) {
        this.name = name;
        this.maxJump = maxJump;
        this.maxRun = maxRun;
    }
    Human human = new Human("Ivan",4,50);
    Human human1 = new Human("Mariya",2,30);

}
