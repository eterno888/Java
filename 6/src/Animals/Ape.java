package Animals;

/**
 * @author ies1541b on 19.04.2016
 */
public class Ape extends Animal {
       
    public double iq = 0;       // iq
    
    public void Ape(){
        System.out.println("Я обезьянка. Я умею ходить на 2 лапах.");
    }    
    
    public void iq(){
        System.out.println("Мой iq = ");
        try {
                iq = Double.parseDouble(bufferedReader.readLine());
            } catch (Exception e) {
                System.out.println("Ошибка. Вес должен быть в цифрах");
            }   
    }
}
