package Animals;

import java.io.IOException;

/**
 * @author Eterno on 18.05.2016
 */

public class Ape extends Animal {

    public double iq = 0;       // iq

    public Ape(){
        System.out.print("IQ ");
        try {
            iq = Double.parseDouble(bufferedReader.readLine());
        } catch (IOException | NumberFormatException e) {
            System.out.println("Ошибка. IQ должен быть в цифрах");
        }
    }

    public void ApeVSFish (Fish f1){
        if(this.weight > f1.weight){
            System.out.println("Обезьянка " + this.name + " смогла поймать рыбу.");
        }
        if(this.weight < f1.weight) {
            System.out.println("Обезьянка " + this.name + " не смогла поймать рыбу.");
        }
    }
}