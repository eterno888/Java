package Animals;

/**
 * Created by Die darling on 05.06.2016.
 */
public class Fish extends Pet {
    public void voice(){
        System.out.println("Оооо");
    }

    public Fish(String name, int age, boolean hungry) {
        setName(name);
        setAge(age);
        setHungry(hungry);
    }
}
