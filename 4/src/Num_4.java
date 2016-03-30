
/**
 *
 * @author ies1541b
 * 
 * Выясните экспериментальном путём, начиная с какого элемента последовательности Фибоначчи, вычисление с использованием рекурсии становится неприемлемым (занимает более минуты по времени).
 */
public class Num_4 {

    static int fib(int n) {
        if ((n == 1) || (n == 2)) {
            return 1;
        }else return fib(n - 2) + fib(n - 1);
    }

    public static void main(String[] args) {
        int n = 0;
        int t = 0;
        while (t <= 60000 ) { //миллисекунд в минуте
            n++;
            long t1 = System.currentTimeMillis(); 
            fib(n);
            long t2 = System.currentTimeMillis();
            t = (int)(t2 - t1);
        }

        System.out.print("Начиная с " + n + " элемента последовательности Фибоначчи, вычисление с использованием ");
        System.out.println("занимает время = " + t + " мc");
    }
}
