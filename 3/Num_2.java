package com.company;

/**
 * Created by Forever on 21.02.2016.
 *
 * Создайте массив из всех нечётных чисел от 1 до 99,
 * выведите его на экран в строку, а затем этот же массив
 * выведите на экран тоже в строку, но в обратном порядке.
 */
public class Num_2 {
    public static void main(String[] args) {
        int[] nums = new int[50];
        int j = 0;

        for (int i = 1; i < 100; i++) {
            if (i % 2 != 0) {
                nums[j] = i;                    //Заполнение массива нечетными числами
                j++;
            }
        }

        for (int i = 0; i < 50; i++) {
            System.out.print(nums[i] + " ");
        }

        System.out.println();

        for (int i = 49; i >= 0; i--) {          //Массив в обратном порядке
            System.out.print(nums[i] + " ");
        }
    }
}
