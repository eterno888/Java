package Animals;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

/**
 *
 * @author ies1541b on 19.04.2016
 *
 */
public class Animal {

    public double weight = 0;       // вес
    public double age = 0;          // возраст
    public double size = 0;         // размер
    String name = null;             // имя
    public boolean eat = true;         // тип питания

    public void wool() {
        System.out.println("Я животное, у меня есть шерсть.");
    }

    public Animal() {
        InputStream inputStream = System.in;
        Reader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        System.out.print("Вес ");
        while (true) {
            try {
                weight = Double.parseDouble(bufferedReader.readLine());
                break;
            } catch (Exception e) {
                System.out.println(" Попробуй ещё раз. Вес должен быть в цифрах");
            }
        }

        System.out.print("Имя ");
        while (true) {
            try {
                name = bufferedReader.readLine();
                break;
            } catch (Exception e) {
                System.out.print(" Попробуй ещё раз");
            }
        }

        System.out.print("Возраст ");
        while (true) {
            try {
                age = Double.parseDouble(bufferedReader.readLine());
                break;
            } catch (Exception e) {
                System.out.print(" Попробуй ещё раз. Возраст должен быть в цифрах");
            }
        }
        
         while (true) {
            try {
                System.out.print("Тип питания (0-плотоядный, 1-травоядный): ");
                String s = bufferedReader.readLine();
                if (s.equals("0")) {
                    eat = true;
                    break;
                } else if (s.equals("1")) {
                    eat = false;
                    break;
                } else {
                    System.out.println("Возможные значения 0 или 1");
                }
            } catch (Exception e) {
                System.out.println("Ошибка");
            }
        }
        
    }    
    
    public void inf(){
        System.out.println("  ");
        System.out.println("  Информация про меня: ");
        System.out.println("Имя " + this.name);
        System.out.println("Bозраст " + this.age);
        System.out.println("Вес " + this.weight);
        System.out.print("Тип питания ");
        if (eat = false) {System.out.println("Травоядный");}
        if (eat = true) {System.out.println("Плотоядный");}
        System.out.println("  ");
    }
    
}
