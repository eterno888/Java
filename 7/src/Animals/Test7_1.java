package Animals;

/**
 *
 * @author Eterno on 25.05.2016
 *
 * 1.Переопределить метод getName в классе Whale(Кит), чтобы программа
 *   выдавала: Я не корова, Я – кит.
 *
 * 2.Написать метод, который определяет, объект какого класса ему передали,
 *   и выводит на экран одну из надписей: Кошка, Собака, Птица, Лампа.
 *
 * 3.Создать два класса Cat(кот) и Dog(собака), класс Dog(собака) происходит
 *   от Cat(кот). Определить метод getChild в классах Cat(кот) и Dog(собака),
 *   чтобы кот порождал кота, а собака – собаку.
 *
 * Задачи на перегрузку методов
 * 1.Написать два метода: print(int) и print(String).
 *
 * 2.Написать два метода: print(int) и print(Integer).Написать такой код
 *   в методе main, чтобы вызвались они оба.
 *
 * 3.Написать пять методов print с разными параметрами.
 *
 * 4.Написать public static методы: int min(int, int), long min(long, long),
 *   double min(double, double). Каждый метод должен возвращать минимальное
 *   из двух переданных в него чисел.
 *
 * 5.Написать public static методы: int max(int, int), long max (long, long),
 *   double max (double, double). Каждый метод должен возвращать максимальное
 *   из двух переданных в него чисел.
 */

public class Test7_1 {

    static int i0 = 0;
    static int i3 = 3;
    static String s = "Строка";
    static Integer i1 = 1;
    static double d2 = 2.2;
    static double d3 = 3.3;
    static long l4 = 4;
    static long l5 = 5;

    public static void main(String[] args) {
         
        Cow cow = new Cow();
        System.out.println("Создаём корову: " + cow.getName());
        Test7_1.getInstanceOf(cow);
        Whale whale = new Whale();
        System.out.println("Создаём кита: " + whale.getName());
        Test7_1.getInstanceOf(whale);
        
        
        System.out.println("Создаём кота: ");
        Cat cat = new Cat();
        cat.inputName();
        cat.getChild();
        Test7_1.getInstanceOf(cat);
        System.out.println("Создаём собаку: ");
        Dog dog = new Dog("Гуфи", 12, true);
        dog.inputName();
        dog.getChild();
        Test7_1.getInstanceOf(dog);

        System.out.println(" ");
        System.out.println("Перегрузка ");

        Test7_1.print(i0);
        Test7_1.print(s);
        Test7_1.print(i1, s);
        Test7_1.print(d2);
        Test7_1.print(s, d2);
        Test7_1.print(i1);                   
        System.out.println(Test7_1.max(d2, d3));
        System.out.println(Test7_1.min(d2, d3));
        System.out.println(Test7_1.max(i0, i3));
        System.out.println(Test7_1.min(i0, i3));
        System.out.println(Test7_1.max(l4, l5));
        System.out.println(Test7_1.min(l4, l5));

    }

    public static void getInstanceOf(Object object){
        if(object instanceof Cat){
            try{
                object = (Dog) object;
                System.out.println("Это собака.");
            }
            catch (Exception e){
                System.out.println("Это кот.");
            }
        }
        if(object instanceof Cow){
            try{
                object = (Whale) object;
                System.out.println("Это кит.");
            }
            catch (Exception e){
                System.out.println("Это корова.");
            }
        }
    }

    public static void print(int a){
        System.out.println("int: " + a);
    }

    public static void print(String a){
        System.out.println("String: " + a);
    }

    public static void print(int a, String s){
        System.out.println("int a, String s: " + a + " " + s);
    }

    public static void print(double a){
        System.out.println("double: " + a);
    }

    public static void print(String a, double a1){
        System.out.println("String, double : " + a + " " + a1);
    }

    public static void print(Integer a){
        System.out.println("Integer: " + a);
    }

    static int min(int a, int b) {
        System.out.print("Min int: ");
        if (a < b) return a;
        else
            return b;
    }

    static long min(long a, long b) {
        System.out.print("Min long: ");
        if (a < b) return a;
        else
            return b;
    }

    static double min(double a, double b) {
        System.out.print("Min double: ");
        if (a < b) return a;
        else
            return b;
    }

    static int max(int a, int b) {
        System.out.print("Max int: ");
        if (a > b) return a;
        else
            return b;
    }

    static long max(long a, long b) {
        System.out.print("Max long: ");
        if (a > b) return a;
        else
            return b;
    }

    static double max(double a, double b) {
        System.out.print("Max double: ");
        if (a > b) return a;
        else
            return b;
    }
}
