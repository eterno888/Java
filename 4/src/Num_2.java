import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author ies1541b on 02.03.2016
 * 
 * 
 */
public class Num_2 {
    public static void main(String[] args) {
        
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        
        int i = 0, a = 0, b = 0, d = 0;
        int[] A1 = new int[10];
        int[] A2 = new int[10];
        int[] A3 = new int[10];
        int[] A4 = new int[10];
        int[] A5 = new int[10];

        String b_str = null, a_str = null;
        try {
            b_str = in.readLine();
            b = Integer.parseInt(b_str);
            a_str = in.readLine();
            a = Integer.parseInt(a_str);
        } catch (IOException ex) {
            System.out.println("Ошибка ввода");
        }

        if (b > a) {
            d = a;
            a = b;
            b = d;
        } 
        A1 = Num_1.sly(b, a, 10);
        
        for (i = 0; i < 10; i++) {
           
            A2[i] = Num_1.slych(b, a);
            A3[i] = Num_1.slych(b, a);
            A4[i] = Num_1.slych(b, a);
            A5[i] = Num_1.slych(b, a);
        }
        out(A1);
        out(A2);
        out(A3);
        out(A4);
        out(A5);
    }

    public static void out(int a[]) {
        for (int i = 0; i < 10; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }
}