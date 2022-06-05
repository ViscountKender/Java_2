package ru.geekbrains.java_2;

import java.util.*;

public class Task1 {

    public void task1() {

        String[] strArr = {"Понедельник", "Вторник", "Среда", "Четверг", "Пятница", "Суббота", "Воскресенье", "Вторник",
                "Январь", "Понедельник", "qwerty", "Среда", "qwerty", "qwerty","Среда"};
        // Конвертируем массив в коллекцию
        List<String> strList = Arrays.asList(strArr);
        // Находим уникальные элемента списка
        System.out.println("Уникальные элементы массива");
        HashSet<String> set = new HashSet<>(strList);
        System.out.println(set);
        // Находим и выводим на печать сколько раз встречается каждый элемент в массиве
        Set<String> unique = new HashSet<>(strList);
        for (String key : unique) {
            System.out.println(key + ": " + Collections.frequency(strList, key));
        }

    }

}
