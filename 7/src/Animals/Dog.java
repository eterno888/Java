package Animals;

/**
 * @author Eterno on 25.05.2016
 */
public class Dog extends Cat {

    @Override
    public Dog getChild() {
        System.out.println("Порождение собаки: ");
        return new Dog("Гуфи", 12, false);
    }

    public Dog(String name, int age, boolean hungry) {
        setName(name);
        setAge(age);
        setHungry(hungry);
    }

    public void voice() {
        System.out.println("Гав");
    }
}
