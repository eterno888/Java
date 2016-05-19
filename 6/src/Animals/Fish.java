package Animals;

/**
 * @author Eterno on 18.05.2016
 */

public class Fish extends Animal {

    public void FishVSHuman(Human h1) {
        if (h1.gender == false) {
            System.out.println("Человек " + h1.name + " женщина, она не занимается рыбалкой.");
        } else {
           if ((h1.gender = true) && (this.weight > h1.weight)) {
            System.out.println("Человек " + h1.name + " не смог поймать рыбу.");
        }
        if ((h1.gender = true) && (this.weight < h1.weight)) {
            System.out.println("Человек " + h1.name + " смог поймать рыбу.");
        } 
        }
    }
}