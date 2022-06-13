package ru.geekbrains.java_2;


public class App05 {

    public static void main(String[] args) throws InterruptedException {
        int size = 109999999;
        float[] array = new float[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = 1.0f;



        }
        MultithreadedArray multithreadedArray = new MultithreadedArray();
        multithreadedArray.secondMethod(array);
        ArrayÑreation arrayÑreation = new ArrayÑreation();
        arrayÑreation.creation(array);



    }
}