package com.company;

/**
 * Created by Forever on 21.02.2016.
 *
 * Создайте массив из 15 случайных целых чисел из отрезка [0;9].
 * Выведите массив на экран. Подсчитайте сколько в массиве чётных элементов и
 * выведете это количество на экран на отдельной строке.
 */
public class Num_3 {
    public static void main(String[] args) {
        int[] nums = new int[15];

        for (int i = 0; i < 15; i++) {
            nums[i] = (int) (Math.random() * 10);              //Math.random() - [0,1)
            System.out.print(nums[i] + " ");
        }

        System.out.println();

        int n = 0;
        for (int i = 0; i < 15; i++)
            if (nums[i] % 2 == 0)
                n++;

        System.out.println("Четных элементов в массиве = " + n);
    }
}

