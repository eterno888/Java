package Animals;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

/**
 * @author ies1541b on 30.03.2016
 */

class Horse {
    // свойства класса
    public double weight = 0;       // вес
    String nick = null;             // кличка
    String horn = null;             // рог
    
    //ввод клички
    public Horse() {
        InputStream inputStream = System.in;
        Reader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        System.out.println("Введите кличку лошади");
            try {
                nick = bufferedReader.readLine();
            } catch (Exception e) {
                System.out.println("Ошибка");
            }
            
        System.out.println("У лошади есть рог?");
            try {
                horn = bufferedReader.readLine();
            } catch (Exception e) {
                System.out.println("Ошибка");
            }    
            
        System.out.println("Введите вес");
            try {
                weight = Integer.parseInt(bufferedReader.readLine());
            } catch (Exception e) {
                System.out.println("Ошибка. Вес должен быть в цифрах");
            }    
    }
}