package javaapplication1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *03.02.2016
 * @author ies1541b
 * Треугольник из 8 размерностью 10 на 10.
 */

public class Task_3 {
       public static void main(String[] args) {  
           
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(8);
            }
            System.out.println(8);
        }    
    
    }
}       
