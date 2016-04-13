package Animals;

/**
 *
 * @author ies1541b on 13.04.2016
 *
 * 2. Написать три класса: Pet(домашнее животное) - с полями вес, пол, возраст,
 * Cat(кот) с полем имя и Dog(собака) с полем имя. Унаследовать кота и собаку
 * от животного. В классах кот и собака реализовать методы вывода информации 
 * о животных.
 * 
 * 4. Скрыть все внутренние переменные класса Cat, добавить методы работы
 * с этими переменными.
 * 
 */

public class Test2 {
    public static void main(String[] args) {
        System.out.println("Создаём кота: ");
        Cat cat = new Cat();
        cat.inputName();
        cat.inf();
        System.out.println("Создаём собаку: ");
        Dog dog = new Dog();    
        dog.inputName();
        cat.inf();

    }
}
