package ru.geekbrains.java_2;

public class MyThreard extends Thread {
    float[] arr;

    public MyThreard() {
    }

    @Override
    public void run() {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (float) (arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i
                    / 5) * Math.cos(0.4f + i / 2));

        }
    }
}