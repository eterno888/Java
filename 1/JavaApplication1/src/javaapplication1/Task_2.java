package javaapplication1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

/**
 * 03.02.2016
 * @author ies1541b
 * Прямоугольник из 8 размерностью m на n.
 */
public class Task_2 {
       public static void main(String[] args) {  
           System.out.println("Введите два числа m и n:");
          
           int n = 0;
           int m = 0;
           
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
           try{
               n_str = bufferedReader.readLine();
           } catch (IOException ex) {
                System.out.print("Ошибка ввода");
           }
           
           n = Integer.parseInt(n_str); //преобразовываем строку в число
           m = Integer.parseInt(m_str); //преобразовываем строку в число
                      
          for (int i = 0; i < m; i++) {
            for (int j = 1; j < n; j++) {
                System.out.print(8);  
            }
            System.out.println(8);  
        }    
    
    }
}       
