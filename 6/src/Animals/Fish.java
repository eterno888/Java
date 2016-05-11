package Animals;

/**
 *
 * @author ies1541b on 19.04.2016
 * 
 */

public class Fish extends Animal {
    
    public void check(Animal fish){
        if(age > 100){
            System.out.println("Рыбы столько точно не живут! Не знаешь, так и скажи. Возраст будет 2 года.");
            age = 2;
        }
    }    
            
    public void whoAreYou(){
        System.out.println("- Я рыба, у меня нету шерсти :c ");
        System.out.println("  Но у меня есть чешуя!) ");
    }
}
