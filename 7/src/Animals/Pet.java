package Animals;

import javax.swing.plaf.basic.BasicButtonUI;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

/**
 *
 * @author Eterno on 05.06.2016
 *
 */

public abstract class Pet {

    private String name;
    private int age;
    private boolean hungry;
    boolean sex = true;              // пол

    InputStream inputStream = System.in;
    Reader inputStreamReader = new InputStreamReader(inputStream);
    BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

    public Pet(){

        System.out.print("Введите пол животного: ");
        while (true) {
            try {
                String s = bufferedReader.readLine();
                if (s.equals("m")) {
                    sex = true;
                    break;
                } else if (s.equals("w")) {
                    sex = false;
                    break;
                } else {
                    System.out.println("Возможные значения m или w");
                }
            } catch (Exception e) {
                System.out.println("Ошибка");
            }
        }
    }

    public  void inputName(){
        String s;
        while (true) {
            try {
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
                System.out.print("Ведите имя: ");
                s = bufferedReader.readLine();
                break;
            } catch (Exception e) {
                System.out.println("Неверно");
            }
        }
        setName(s);
    }

    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isHungry() {
        return hungry;
    }

    public void setHungry(boolean hungry) {
        this.hungry = hungry;
    }
    public abstract void voice();

}