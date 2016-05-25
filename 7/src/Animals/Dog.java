package Animals;

/**
 * @author Eterno on 25.05.2016
 */
public class Dog extends Cat{

    @Override   
    public Dog getChild(){
        System.out.println("Порождение собаки: ");
        return new Dog();
    }
}