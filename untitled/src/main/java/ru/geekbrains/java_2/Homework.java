package ru.geekbrains.java_2;

public class Homework {



    public  void transformation (String [][] arr) throws MyArraySizeException, MyArrayDataException {
        // Проверяем массив на размерность, массив на вход должен быть 4*4
        int arrayLenght = 4;
        if(arr.length != arrayLenght){
            throw new MyArraySizeException(String.format("Размерность массива должна быть %dх%d.",
                    arrayLenght, arrayLenght));
        }

        // Проверяем каждый размерность вложенных массивов
        for (int i = 0; i < arr.length; i++) {
            if(arr[i].length != arrayLenght){
                throw new MyArraySizeException(String.format("Размерность массива должна быть %dх%d.",
                        arrayLenght, arrayLenght));
            }

        }

    int result = 0;

         for (int i = 0; i <arr.length; i++) {

            for (int j = 0; j < arr[i].length; j++) {
                try{
                 result = result + Integer.parseInt(arr[i][j]);

                   }catch (NumberFormatException e){
                    throw new MyArrayDataException(String.format("В позиции [%d][%d] исходного массива находится не целое число %s.",
                            i, j, arr[i][j]));
                }
            }

        }

        System.out.println(result);


    }

    public static void main(String[] args) {
        Homework homework = new Homework();
        String[][] strArr0 = new String[][] {
                {"5", "g", "3", "4"},
                {"1", "2", "3", "4"},
                {"1", "2", "5", "6"},
                {"1", "2", "4", "8"}
        };

        String[][] strArr1 = {
                {"2", "5", "6","0"},
                {"0","1", "10","8"},
                {"1","0", "0", "1"},
                {"5","1", "8", "1"}

        };
        String[][] strArr2 = new String[][] {
                {"5", "g", "3"},
                {"1", "2", "3", "4"},
                {"1", "2", "5", "6"},
                {"1", "2", "4", "8"}
        };
        String[][] strArr3 = new String[][] {
                {"1", "2", "3", "4"},
                {"1", "2", "5", "6"},
                {"1", "2", "4", "8"}
        };
        try {
            System.out.println("Сумма элементов массива равна ");
                    homework.transformation(strArr0);
        } catch (MyArraySizeException | MyArrayDataException e) {
            System.out.println(e);
        }
        try {
            System.out.println("Сумма элементов массива равна ");
            homework.transformation(strArr1);
        } catch (MyArraySizeException | MyArrayDataException e) {
            System.out.println(e);
        }
        try {
            System.out.println("Сумма элементов массива равна ");
            homework.transformation(strArr2);
        } catch (MyArraySizeException | MyArrayDataException e) {
            System.out.println(e);
        }
        try {
            System.out.println("Сумма элементов массива равна ");
            homework.transformation(strArr3);
        } catch (MyArraySizeException | MyArrayDataException e) {
            System.out.println(e);
        }
        


    }

}

