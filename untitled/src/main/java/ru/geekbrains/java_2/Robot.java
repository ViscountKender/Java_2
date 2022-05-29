package ru.geekbrains.java_2;

public class Robot {
    String name;
    int maxJump;
    int maxRun;

    public Robot(String name, int maxJump, int maxRun) {
        this.name = name;
        this.maxJump = maxJump;
        this.maxRun = maxRun;
    }
    Robot robot = new Robot("Gromazeka",4,20);
    Robot robot1 = new Robot("Zeleboba",15,12);
}
