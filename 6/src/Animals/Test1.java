package Animals;

/**
 *
 * @author ies1541b
 * 
 * 1. Написать два класса: Horse(лошадь) - в конструкторе задается кличка лошади и 
 * Pegas(пегас) - релизующий метод полет(сообщает какая лошадь летит). 
 * Унаследовать пегаса от лошади.
 */
public class Test1 {
    public static void main(String[] args) {
         Pegas p1 = new Pegas();
         Pegas.fly(p1);
    }
}
