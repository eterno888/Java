package Animals;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

/**
 *
 * @author ies1541b on 07.04.2016
 *
 * 2. Написать три класса: Pet(домашнее животное) - с полями вес, пол, возраст,
 * Cat(кот) с полем имя и Dog(собака) с полем имя. Унаследовать кота и собаку от
 * животного. В классах кот и собака реализовать методы вывода информации о
 * животных.
 */
public class Pet {

    public double weight = 0;       // вес
    boolean sex = true;              // пол
    public double age = 0;          // возраст

    //ввод 
    public Pet() {
        InputStream inputStream = System.in;
        Reader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        System.out.print("Введите пол животного: ");
        while (true) {
            try {
                String s = bufferedReader.readLine();
                if (s.equals("m")) {
                    sex = true;
                    break;
                } else if (s.equals("w")) {
                    sex = false;
                    break;
                } else {
                    System.out.println("Возможные значения m или w");
                }
            } catch (Exception e) {
                System.out.println("Ошибка");
            }
        }
        System.out.print("Введите вес: ");
        try {
            weight = Double.parseDouble(bufferedReader.readLine());
        } catch (Exception e) {
            System.out.println("Ошибка. Вес должен быть в цифрах");
        }

        System.out.print("Введите возраст: ");
        try {
            age = Double.parseDouble(bufferedReader.readLine());
        } catch (Exception e) {
            System.out.println("Ошибка. Возраст должен быть в цифрах");
        }
    }
}
