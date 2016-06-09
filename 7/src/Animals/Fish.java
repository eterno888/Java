package Animals;

/**
 * Created by Eterno on 05.06.2016.
 */
public class Fish extends Pet {

    @Override
    public void voice() {
        System.out.println("Оооо");
    }

    public Fish(String name, int age, boolean hungry) {
        setName(name);
        setAge(age);
        setHungry(hungry);
    }
}
