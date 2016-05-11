package Animals;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

/**
 * @author ies1541b on 19.04.2016
 */
public class Ape extends Animal {
       
    public double iq = 0;       // iq
    
    public void whoAreYou(){
        System.out.println("Я обезьянка. Я умею ходить на 2 лапах.");
    }    
    
    public void IQ(){
        
        InputStream inputStream = System.in;
        Reader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        
        System.out.println("Мой IQ = ");
        try {
                iq = Double.parseDouble(bufferedReader.readLine());
            } catch (IOException | NumberFormatException e) {
                System.out.println("Ошибка. IQ должен быть в цифрах");
            }   
    }
}
