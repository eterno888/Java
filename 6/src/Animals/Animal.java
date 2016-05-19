package Animals;

import javax.xml.soap.SOAPPart;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

/**
 * @author Eterno on 18.05.2016
 */

public class Animal {

    InputStream inputStream = System.in;
    Reader inputStreamReader = new InputStreamReader(inputStream);
    BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

    public double weight = 0;                // веc
    String name = null;                      // имя

    public Animal() {

        System.out.print("Имя ");
        while (true) {
            try {
                name = bufferedReader.readLine();
                break;
            } catch (Exception e) {
                System.out.print(" Попробуй ещё раз");
            }
        }

        System.out.print("Вес ");
        while (true) {
            try {
                weight = Double.parseDouble(bufferedReader.readLine());
                break;
            } catch (Exception e) {
                System.out.println(" Попробуй ещё раз. Вес должен быть в цифрах");
            }
        }
    }
}