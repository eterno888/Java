package javaapplication1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

/**
 * 03.02.2016
 *
 * @author ies1541b Сравнение 2 Имен.
 */
public class Task_5 {

    public static void main(String[] args) {
        System.out.println("Введите два слова:");

        InputStream inputStream = System.in;
        Reader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        String first_str = null;
        try {
            first_str = bufferedReader.readLine(); //читаем строку с клавиатуры
        } catch (IOException ex) {
            System.out.print("Ошибка ввода");
        }

        String second_str = null;
        try {
            second_str = bufferedReader.readLine();
        } catch (IOException ex) {
            System.out.print("Ошибка ввода");
        }
        
        if (second_str.equals(first_str))
            System.out.println("Имена равны");
        else
            System.out.println("Имена не равны");
        
        if (second_str.length() == first_str.length())
            System.out.println("Длина имен равна");
    }
}
