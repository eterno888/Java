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
    
    public void wool(){
        System.out.println("Я животное, у меня есть шерсть.");
    } 
    
    public Animal() {
        InputStream inputStream = System.in;
        Reader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);  
        
        System.out.println("Мой вес ");
            try {
                weight = Double.parseDouble(bufferedReader.readLine());
            } catch (Exception e) {
                System.out.println("Ошибка. Вес должен быть в цифрах");
            }    
        
        System.out.println("Мой рост ");
            try {
                size = Double.parseDouble(bufferedReader.readLine());
            } catch (Exception e) {
                System.out.println("Ошибка. Рост должен быть в цифрах");
            } 
            
        System.out.println("Моё имя ");
            try {
                name = bufferedReader.readLine();
            } catch (Exception e) {
                System.out.println("Ошибка");
            }
            
        System.out.println("Мой возраст ");
            try {
                age = Double.parseDouble(bufferedReader.readLine());
            } catch (Exception e) {
                System.out.println("Ошибка. Возраст должен быть в цифрах");
            }
    }
}
