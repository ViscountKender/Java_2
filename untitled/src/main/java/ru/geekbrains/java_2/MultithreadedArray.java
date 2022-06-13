package ru.geekbrains.java_2;

public class MultithreadedArray extends Thread {
    public void secondMethod(float[] arr) throws InterruptedException {
        long startTime = System.currentTimeMillis();
        int half = arr.length / 2;
        float[] leftHalf = new float[half];
        float[] rightHalf = new float[half];
        System.arraycopy(arr, 0, leftHalf, 0, half);
        System.arraycopy(arr, half, rightHalf, 0, half);
        MyThreads myThreads = new MyThreads();
        myThreads.arr = leftHalf;
        myThreads.start();
        MyThreads myThreads1 = new MyThreads();
        myThreads1.arr = rightHalf;
        myThreads1.start();
        myThreads.join();
        myThreads1.join();

        float[] mergedArray = new float[arr.length];
        System.arraycopy(myThreads.arr, 0, mergedArray, 0, half);
        System.arraycopy(myThreads1.arr, 0, mergedArray, half, half);

        System.out.println("Второй метод за время: " + (System.currentTimeMillis() -
                startTime) + " мс.");

    }
}
