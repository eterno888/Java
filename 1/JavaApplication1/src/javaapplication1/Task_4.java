package javaapplication1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

/**
 * 03.02.2016
 *
 * @author ies1541b Минимум 2 чисел
 */
public class Task_4 {

    public static void main(String[] args) {
        System.out.println("Введите два числа m и n:");

        InputStream inputStream = System.in;
        Reader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        String m_str = null;
        try {
            m_str = bufferedReader.readLine(); //читаем строку с клавиатуры
        } catch (IOException ex) {
            System.out.print("Ошибка ввода");
        }

        String n_str = null;
        try {
            n_str = bufferedReader.readLine();
        } catch (IOException ex) {
            System.out.print("Ошибка ввода");
        }

        int n = Integer.parseInt(n_str); //преобразовываем строку в число
        int m = Integer.parseInt(m_str); //преобразовываем строку в число

        int k = minimum(m, n);

    }

    /**
     *
     * @param m
     * @param n
     * @return
     */
    public static int minimum(int m, int n) {
        if (m == n) {
            System.out.println("Числа равны");
        }
        if (m > n) {
            System.out.println("Наименьшее число n=" + n);
        } 
        if (n > m) {
            System.out.println("Наименьшее число m=" + m);
        }
        return (0);
    }
}
