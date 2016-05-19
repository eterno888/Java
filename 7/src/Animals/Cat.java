package Animals;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

/**
 *
 * @author ies1541b
 */
public class Cat extends Pet {
    
    private String name;
    
    public  void inputName(){
        String s;   
        InputStream inputStream = System.in;
        Reader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        
        while (true) {
            try {
                
                System.out.println("Ведите имя кота: ");
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
    
    public void inf(){
        System.out.println(this.age);
        System.out.println(this.sex);
        System.out.println(this.weight);
    }
}
