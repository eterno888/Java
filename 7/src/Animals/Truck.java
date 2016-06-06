package Animals;

/**
 * Created by Eterno on 06.06.2016.
 */
public class Truck implements CargoAuto {

    public void moveTo(int distance) {
        if (distance > 200) {
            System.out.println("Грузовик не может ехать дальше 200 км.");
        } else {
            System.out.println("Груз перевезен на " + distance + " км.");
        }
    }
}
