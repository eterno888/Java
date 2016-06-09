import java.util.*;

/**
 * Created by Eterno on 08.06.2016.
 * <p>
 * ЗАДАНИЯ
 * 1. HashSet из растений. Создать коллекцию HashSet с типом элементов String. Добавить в неё 10 строк:
 * арбуз, банан, вишня, груша, дыня, ежевика, жень-шень, земляника, ирис, картофель. Вывести содержимое
 * коллекции на экран, каждый элемент с новой строки.Посмотреть, как изменился порядок добавленных элементов.
 * <p>
 * 2. HashMap из 10 пар Создать коллекцию HashMap<String, String>, занести туда 10 пар строк: арбуз - ягода,
 * банан - трава, вишня - ягода, груша - фрукт, дыня - овощ, ежевика - куст, жень-шень - корень,
 * земляника - ягода, ирис - цветок, картофель - клубень. Вывести содержимое коллекции на экран, каждый элемент
 * с новой строки. Пример вывода (тут показана только одна строка):картофель - клубень
 * <p>
 * 3. Коллекция HashMap из котов Есть класс Cat, с полем имя (name, String).
 * Создать коллекцию HashMap<String, Cat>. Добавить в коллекцию 10 котов, в качестве ключа использовать имя кота.
 * Вывести результат на экран, каждый элемент с новой строки.
 * <p>
 * 4. Вывести на экран список ключей Есть коллекция HashMap<String, String>, туда занесли 10 различных строк.
 * Вывести на экран список ключей, каждый элемент с новой строки.
 * <p>
 * 5. Вывести на экран список значений Есть коллекция HashMap<String, String>, туда занесли 10 различных строк.
 * Вывести на экран список значений, каждый элемент с новой строки.
 * <p>
 * 6. Коллекция HashMap из Object Есть коллекция HashMap<String, Object>, туда занесли 10 различных пар объектов.
 * Вывести содержимое коллекции на экран, каждый элемент с новой строки.
 * Пример вывода (тут показана только одна строка): Sim - 5
 */
public class Collection {
     
    public static void main(String[] args) {

        Set<String> plantset = new HashSet<String>();
        plantset.add("арбуз");
        plantset.add("вишня");
        plantset.add("дыня");
        plantset.add("жень-шень");
        plantset.add("ирис");
        plantset.add("картофель");

        System.out.println("Задание №1 \nCписок: " + plantset);

        Iterator<String> iterator = plantset.iterator();
        System.out.println("Каждый элемент новой строки: ");
        while (iterator.hasNext())                          //проверка, есть ли ещё элементы
        {
            String text = iterator.next();                  //получение текущего элемента и переход на следующий
            System.out.println(text);
        }

        System.out.println("\nЗадание №2");
        Map<String, String> maplants = new HashMap<String, String>();
        maplants.put("арбуз", "ягода");
        maplants.put("банан", "трава");
        maplants.put("дыня", "овощ");
        maplants.put("ирис", "цветок");

        Iterator<Map.Entry<String, String>> iterator1 = maplants.entrySet().iterator();

        while (iterator1.hasNext()) {
            Map.Entry<String, String> pair = iterator1.next();     //получение «пары» элементов
            String key = pair.getKey();                            //ключ
            String value = pair.getValue();                        //значение
            System.out.println(key + " - " + value);
        }

        System.out.println("\nЗадание №3");
        Map<String, Cat> cats = new HashMap<String, Cat>();

        for (int i = 1; i < 11; i++) {
            String name = "Кот " + i;
            Cat cat = new Cat(name);
            cats.put(cat.getName(), cat);
        }

        Iterator<Map.Entry<String, Cat>> iterator2 = cats.entrySet().iterator();
        while (iterator2.hasNext()) {
            Map.Entry<String, Cat> pair = iterator2.next();
            String key = pair.getKey();
            Cat value = pair.getValue();
            System.out.println(key + " - " + value);
        }

        System.out.println("\nЗадание №4");
        Iterator<Map.Entry<String, String>> iterator3 = maplants.entrySet().iterator();
        while (iterator3.hasNext()) {
            Map.Entry<String, String> pair = iterator3.next();
            String key = pair.getKey();
            System.out.println(key);
        }

        System.out.println("\nЗадание №5");
        Iterator<Map.Entry<String, String>> iterator4 = maplants.entrySet().iterator();
        while (iterator4.hasNext()) {
            Map.Entry<String, String> pair = iterator4.next();
            String value = pair.getValue();
            System.out.println(value);
        }

        System.out.println("\n Задание №6");
        Map<String, Object> sim = new HashMap<String, Object>();

        for (int i = 1; i < 11; i++) {
            String nam = "№" + i;
            Object o = "object";
            sim.put(nam, o);
        }
        
        Iterator<Map.Entry<String, Object>> iterator5 = sim.entrySet().iterator();
        while (iterator5.hasNext()) {
            Map.Entry<String, Object> pair = iterator5.next();
            String key = pair.getKey();
            Object value = pair.getValue();
            System.out.println(key + " - " + value);
        }
    }

}

