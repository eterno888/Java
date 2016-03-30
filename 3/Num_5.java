package com.company;

/**
 * Created by Forever on 21.02.2016.
 *
 * Создать двумерный массив из 7 строк по 4 столбца в каждой
 * из случайных целых чисел из отрезка [-5;5]. Вывести массив на экран.
 * Определить и вывести на экран индекс строки с наибольшим по модулю произведением элементов.
 * Если таких строк несколько, то вывести индекс первой встретившейся из них.
 */
public class Num_5 {
    public static void main(String[] args) {
        int[][] arr = new int[7][4];

        int mod = 0;                                        //Модуль произведения
        int n = 1;                                          //Индекс

        for (int i = 0; i < 7; i++) {
            int mod_i = 1;                                   //Сравнение с mod
            for (int j = 0; j < 4; j++) {
                arr[i][j] = (int) (Math.random() * 11) - 5;
                mod_i *= arr[i][j];
                System.out.print("  " + arr[i][j]);
            }

            if (Math.abs(mod_i) > mod) {                    //abs-по модулю
                mod = mod_i;
                n = i;                                      //Индекс текущей строки
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("Индекс строки с наибольшим по модулю произведению элементов : " + n);
    }
}
