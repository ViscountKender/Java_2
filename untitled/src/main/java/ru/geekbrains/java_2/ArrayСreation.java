package ru.geekbrains.java_2;

public class ArrayСreation {

    public  void creation(float[] array) {
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < array.length; i++) {
            array[i] = (float) (array[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i
                    / 5) * Math.cos(0.4f + i / 2));
        }
        System.out.println("Первый метод за время: " + (System.currentTimeMillis() -
                startTime) + " мс.");


    }
}