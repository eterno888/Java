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
    
    static int i = 0;
    static String s = "Строка";
    static int i1 = 1;
    static double d = 2;          
    
    public static void main(String[] args) {
        
        System.out.println("Создаём кота: ");
        Cat cat = new Cat();
        cat.inputName();
        cat.getChild();
        Test7_1.getInstanceOf(cat);
        System.out.println("Создаём собаку: ");
        Dog dog = new Dog();    
        dog.inputName();
        dog.getChild();
        Test7_1.getInstanceOf(dog);
        
        System.out.println("Перегрузка ");
       
        Test7_1.print(i);
        Test7_1.print(s);
        Test7_1.print(i, s);
        Test7_1.print(d);
        Test7_1.print(s, d);
        Test7_1.print(i1);     //ДОПИСАТЬ
        
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
        System.out.println("int a, String s: " + a + s);    
    }
    
    public static void print(double a){
        System.out.println("double: " + a);    
    }
    
    public static void print(String a, double a1){
        System.out.println("String, double : " + a + a1);    
    }
    
    public static void print(Integer a){
        System.out.println("Integer: " + a);
    }
    
    int min(int, int), long min(long, long), double min(double, double). 
}

