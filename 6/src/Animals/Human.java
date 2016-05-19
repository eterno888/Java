package Animals;

/**
 * @author Eterno on 18.05.2016
 */

public class Human extends Ape {

    public boolean gender = true;            // пол

    public Human() {

        System.out.print("Пол ");
        while (true) {
            try {
                String s = bufferedReader.readLine();
                if (s.equals("M")) {
                    gender = true;
                    break;
                } else if (s.equals("W")) {
                    gender = false;
                    break;
                } else {
                    System.out.println("Возможные значения M или W");
                }
            } catch (Exception e) {
                System.out.println("Ошибка");
            }
        }
    }

    public void HumanVSApe(Ape a1) {
        if ((a1.iq > this.iq) && (a1.weight < this.weight)) {
            System.out.println("Человек " + this.name + " подружится с обезьянкой.");
        }
        if ((a1.iq < this.iq) && (a1.weight > this.weight)) {
            System.out.println("Человек " + this.name + " победит обезьяну интеллектом.");
        }
        if ((a1.iq >= this.iq) && (a1.weight >= this.weight)){
            System.out.println("Человек " + this.name + " подерется с обезьяной.");
        }    
    }
}
