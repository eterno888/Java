package Animals;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import javax.sound.sampled.SourceDataLine;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

/**
 *
 * @author Eterno on 25.05.2016
 */
public class Cat extends Pet {

    public Cat() {
    }

    public Cat(String name, int age, boolean hungry) {
        setName(name);
        setAge(age);
        setHungry(hungry);
    }

    public Cat getChild() {
        System.out.println("Порождение кота: ");
        return new Cat("Феликс", 1, true);
    }

    public void voice() {
        System.out.println("Миу");
    }

}
