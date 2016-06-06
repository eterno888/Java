package Animals;

/**
 * Created by Eterno on 06.06.2016.
 */
public class Sedan {

    public void moveTo(String name, int distance) {
        if (distance > 50) {
            System.out.println("Седан не может ехать дальше 50 км.");
        } else {
            System.out.println(name + " перевезен на " + distance + " км.");
        }
    }
}
