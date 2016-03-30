package Animals;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

/**
 * @author ies1541b on 30.03.2016
 *
 * Написать два класса: Horse(лошадь) - в конструкторе задается кличка лошади и 
 * Pegas(пегас) - релизующий метод полет(сообщает какая лошадь летит). 
 * Унаследовать пегаса от лошади.
 */

class Horse {
    // свойства класса
    public double v = 0; // вес
    String k = null; // кличка
    
    //ввод клички
    public Horse() {
        InputStream inputStream = System.in;
        Reader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        System.out.println("Введите кличку лошади");
            try {
                k = bufferedReader.readLine();
            } catch (Exception e) {
                System.out.println("Ошибка");
            }
        System.out.println("Введите вес");
            try {
                v = Integer.parseInt(bufferedReader.readLine());
            } catch (Exception e) {
                System.out.println("Ошибка. Вес должен быть в цифрах");
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
