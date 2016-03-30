package com.company;

/**
 * Created by Forever on 21.02.2016.
 *
 * Создайте массив из всех чётных чисел от 2 до 20 и выведите элементы массива на экран
 * сначала в строку, отделяя один элемент от другого пробелом,
 * а затем в столбик (отделяя один элемент от другого началом новой строки).
 */
public class Num_1 {
    public static void main(String[] args) {

        int[] nums = new int[]{2, 4, 6, 8, 10, 12, 14, 16, 18, 20};

        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }

        System.out.println();

        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }
    }
}
