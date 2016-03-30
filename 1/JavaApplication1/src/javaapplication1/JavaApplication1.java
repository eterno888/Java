package javaapplication1;

/**
 * 03.02.2016
 * @author ies1541b
 * Все целые числа от 1 до 100.
 */
public class JavaApplication1 {
    public static void main(String[] args) {
          for (int i = 1; i <= 100; i++)
            if ((i % 2) == 0) {
                System.out.print(i+" ");
            }
    }
    
}

