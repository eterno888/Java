package Animals;

/**
 * Created by Die darling on 06.06.2016.
 */
public class Pickup implements PassengersAuto, CargoAuto {

    public void moveTo(String name, int distance) {
        if (distance > 100) {
            System.out.println("Пикап не может ехать с людьми дальше 100 км.");
        } else {
            System.out.println(name + " перевезен на " + distance + " км.");
        }
    }

    public void moveTo(int distance) {
        if (distance > 150) {
            System.out.println("Пикап не может ехать с грузом дальше 150 км.");
        } else {
            System.out.println("Груз перевезен на " + distance + " км.");
        }
    }
}
