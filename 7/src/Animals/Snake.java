package Animals;

/**
 * Created by Die darling on 05.06.2016.
 */
public class Snake extends Pet {

    public void voice(){
        System.out.println("Шшшшш");
    }

    public Snake(String name, int age, boolean hungry) {
        setName(name);
        setAge(age);
        setHungry(hungry);
    }
}
