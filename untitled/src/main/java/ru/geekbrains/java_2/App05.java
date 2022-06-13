package ru.geekbrains.java_2;


public class App05 {

    public static void main(String[] args) throws InterruptedException {
        int size = 10000000;
        float[] array = new float[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = 1.0f;



        }
        MultithreadedArray multithreadedArray = new MultithreadedArray();
        multithreadedArray.secondMethod(array);
        ArrayСreation arraycreationreation = new ArrayСreation();
        arraycreationreation.creation(array);



    }
}