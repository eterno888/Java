package Circle;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author ies1541b on 12.03.2016
 *
 * 1. Создайте в классе Circle метод, вычисляющий длину окружности.
 * 
 * 2. Создайте в классе Circle метод, перемещающий центр круга в случайную
 * точку квадрата координатной плоскости с диагональю от [-99;-99] до [99;99].
 * Обратите внимание на то, что требуется создать обычный метод, применимый
 * к уже существующему объекту, а не конструктор создающий новый объект.
 * 
 * 3. Измените в классе Circle конструктор по умолчанию так, чтобы в момент
 * создания объекта с его помощью, координаты центра и радиус окружности 
 * пользователь вводил с клавиатуры.
 * 
 * 4. Создайте в классе Circle метод, вычисляющий расстояние между центрами
 * двух окружностей.
 * 
 * 5. Создайте в классе Circle метод, проверяющий, касаются ли окружности
 * в одной точке. Учтите, что возможен вариант, когда одна окружность 
 * содержится внутри другой и при этом всё равно возможно касание в одной точке.
 */

class Circle {
    // свойства класса
    public double x = 0; // абсцисса центра
    public double y = 0; // ордината центра
    public double r = 0; // радиус
    
    // выводит на экран параметры окружности
    public void printCircle() {
        System.out.println("Окружность с центром (" + x + ";" + y + "), радиусом " + r + " и длиной " + r * 2 * Math.PI);
    }
    
    // перемещение центра круга
    public void moveR() {
        x = (int)(Math.random()* (199) - 99);
        y = (int)(Math.random()* (199) - 99);
    }
    
     // касание окружностей в одной точке
    public static void touch(Circle o1, Circle o2){
        if ((o1.r + o2.r) == dis(o1,o2))
        System.out.println("Внешнее касание двух окружностей");
        if ((o1.r - o2.r) == dis(o1,o2))
        System.out.println("Внутреннее касание двух окружностей");
        else 
        System.out.println("Нет касания");    
    }
    
    // расстояние между центрами окружностей
    public static double dis(Circle o1, Circle o2) {
        double c = 0;
        c = Math.sqrt(Math.pow(o2.x - o1.x, 2) + Math.pow(o2.y - o1.y, 2));
        return(c);
    }

    //ввод координат и радиуса с клавиатуры
    public Circle() {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Вводите координаты");
        while (true) {
            try {
                System.out.print("x: ");
                x = Integer.parseInt(reader.readLine());
                System.out.print("y: ");
                y = Integer.parseInt(reader.readLine());
                System.out.print("r: ");
                r = Integer.parseInt(reader.readLine());
                break;
            } catch (Exception e) {
                System.out.println("Ошибка. Вводите цифры.");
            }
        }
    }
}
// описываем основной класс, содержащий метод main
public class Num_1 {
    public static void main(String[] args) {
        // Создаём объект (окружность класса Circle), у неё будет нулевой
        // радиус и центр в (0.0;0.0), поскольку все свойства получат
        // значения по умолчанию
        Circle o1 = new Circle();
        // Меняем абсциссу центра, обращааясь к свойству x
        // o1.x = 3;
        // Меняем радиус, обращааясь к свойству r
        // o1.r = 12.3;
        // выводим на экран параметры окружности
        System.out.print("1. ");
        o1.printCircle();
        System.out.println("2. После перемещения: ");
        o1.moveR();
        o1.printCircle();
        // Создаём другой объект того же класса
        Circle o2 = new Circle();
        o2.printCircle();
        System.out.println("4. Расстояние между центрами: " + Circle.dis(o1, o2)); 
        System.out.println("5. Касание окружностей: ");
        Circle.touch(o1, o2);
    }
}
