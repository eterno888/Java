package Animals;

/**
 *
 * @author ies1541b on 19.04.2016
 * 
 * Написать четыре класса: Fish(Рыбы), Animal(Животные), Ape(Обезьяны),
 * Human(Человек). Унаследовать рыб от животных, обезьян от животных и 
 * человека от обезьян. Поля и методы разработать самостоятельно.
 */
public class Test3 {
   public static void main(String[] args) { 
//    System.out.println("Дедушка Бог ушёл на пенсию, вы заняли его место. "); 
//    System.out.println("Порадовались? Но Вы же не знаете как работает его программа по созданию мира...");
//    System.out.println("Ну что ж теперь делать, пробуй.");
    System.out.println();
    System.out.println("Для начала создай рыбу: ");
    Fish f1 = new Fish();
    f1.check(f1);
    f1.whoAreYou();
 //   f1.inf();
    System.out.println("Теперь объезьянку: ");
    Ape a1 = new Ape();
    a1.whoAreYou();
    a1.IQ();
    
    }
}