package Animals;

/**
 *
 * @author ies1541b
 */
public class Pegas extends Horse {
    
     public static void fly(Horse horse){
        if ((horse.horn.equalsIgnoreCase("yes"))&&(horse.weight < 500)) 
        System.out.println("Ваша лошадь летает! Поздравляю!  P.S. Обратитесь к наркологу, он Вам поможет");
        else 
        System.out.println("Всё хорошо, у вас обычная лошадь!");
     }
 
}
