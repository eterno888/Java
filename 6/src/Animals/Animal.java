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

        System.out.print("Рост ");
        while (true) {
            try {
                size = Double.parseDouble(bufferedReader.readLine());
                break;
            } catch (Exception e) {
                System.out.print(" Попробуй ещё раз. Рост должен быть в цифрах");
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
    }
    
    public void inf(){
        System.out.println("Имя " + this.name);
        System.out.println("возраст " + this.age);
        System.out.println ("Рост " + this.size);
        System.out.println("Вес " + this.weight);
    }
    
}
