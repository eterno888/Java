
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.Arrays;

/**
 *
 * @author ies1541b on 22.02.2016
 *
 * Создать статический метод, который будет иметь два целочисленных параметра a
 * и b, и в качестве своего значения возвращать случайное целое число из отрезка
 * [a;b]. C помощью данного метода заполнить массив из 20 целых чисел и вывести
 * его на экран
 */
public class Num_1 {

    public static int[] sly(int a, int b, int n) {
        int[] c = new int[n];
        for (int i = 0; i < n; i++){
            c[i] = (int) (Math.random() * (b - a + 1) + a);
        }
        return (c);
    }
    
      public static int slych(int a, int b) {
        int c = (int) (Math.random() * (b - a + 1) + a);
        return (c);
    }
    
    public static void main(String[] args) {
        int a = 0, b = 0, n = 20;

        InputStream inputStream = System.in;
        Reader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        System.out.println("Введите параметры отрезка: ");

        String str_a = null, str_b = null;
        try {
            str_a = bufferedReader.readLine(); //читаем строку с клавиатуры
            a = Integer.parseInt(str_a);
            str_b = bufferedReader.readLine();
            b = Integer.parseInt(str_b);
        } catch (Exception ex) {
            System.out.print("Ошибка! Проверьте числа.");
        }

        System.out.println(Arrays.toString(sly(a, b, n)));         
    }
}
