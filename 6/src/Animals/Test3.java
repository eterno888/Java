package Animals;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

/**
 * @author Eterno on 18.05.2016
 *         <p>
 *         Написать четыре класса: Fish(Рыбы), Animal(Животные), Ape(Обезьяны),
 *         Human(Человек). Унаследовать рыб от животных, обезьян от животных и
 *         человека от обезьян. Поля и методы разработать самостоятельно.
 */

public class Test3 {

    public static void main(String[] args) {
        
    System.out.println("Создание человека:");
    Human h1 = new Human();
    System.out.println("Создание обезьяны:");
    Ape a1 = new Ape();
    System.out.println("Создание рыбы:");
    Fish f1 = new Fish();
    System.out.print("Человек встретил обезьяну. ");
    h1.HumanVSApe(a1);
    System.out.print("Обезьяна встретила рыбу. ");
    a1.ApeVSFish(f1);
    System.out.print("Человек встретил рыбу. ");
    f1.FishVSHuman(h1);  
    }
}
