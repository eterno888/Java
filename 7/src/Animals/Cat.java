package Animals;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

/**
 *
 * @author Eterno on 25.05.2016
 */
public class Cat {
    
    private String name;
    boolean sex = true;              // пол
    
    
     
    InputStream inputStream = System.in;
    Reader inputStreamReader = new InputStreamReader(inputStream);
    BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        
    public Cat(){

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
    }
    
    public  void inputName(){
        String s;     
        while (true) {
            try {
                
                System.out.println("Ведите имя: ");
                s = bufferedReader.readLine();
                break;
            } catch (Exception e) {
                System.out.println("Неверно");
            }
        }
        setName(s);
    }
    
    private void setName(String name){
        this.name = name;
    }
    
    public String getName(){
        return name;
    }
    
    public Cat getChild(){
        System.out.println("Порождение кота: ");
        return new Cat();
    }
    
}
