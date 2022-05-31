package ru.geekbrains.java_2;

public class Homework {


    public static void transformation(String [][] arr1){

  String [][] arr = new String[][] {
        {"2", "5", "6", "0"},
        {"0","1", "10", "8"},
        {"1","0", "0",  "1"},
        {"5","1", "8",  "1"}
  };
    int result = 0;

        for (int i = 0; i <arr.length; i++) {

        for (int j = 0; j < arr[i].length; j++) {
            result = result + Integer.parseInt(arr[i][j]);

        }

        }
        System.out.println(result);

 }

    public static void main(String[] args) {
        String strArr [][] = {
                {"2", "5", "6","0"},
                {"0","1", "10","8"},
                {"1","0", "0", "1"},
                {"5","1", "8", "1"}

        };
         transformation(strArr);

    }

}

