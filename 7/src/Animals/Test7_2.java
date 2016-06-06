package Animals;

/**
 * Created by Eterno on 05.06.2016.
 *
 * ЗАДАЧИ НА АБСТРАКТНЫЕ КЛАССЫ
 *
 * 1. Сделать класс Pet (Лабораторная №6) абстрактным.
 *
 * 2. Создать абстрактный класс Pet с полями name, age, hungry(хочет есть) и абстрактный метод voice(голос).
 * Создать классы Snake, Dog, PatrolDog, Cat, Fish и наследники класса Pet. В каждом классе реализовать метод voice.
 *
 * ЗАДАЧИ НА ИНТЕРФЕЙСЫ
 *
 * 3. Реализовать два интерфейса PassengersAuto (описать метод перевозки пассажиров) и CargoAuto (описать метод
 * перевозки груза). Написать классы Truck, Sedan, Pickup, реализующие эти интерфейсы.
 */

public class Test7_2 {
    public static void main(String[] args) {
       
        Snake snake = new Snake("Змея", 10, true);
        Dog dog = new Dog("Далматинец", 20, true);
        PatrolDog patrolDog = new PatrolDog("Патрульная собака", 12, true);
        Cat cat = new Cat("Кошка", 13, false);
        Fish fish = new Fish("Рыба", 14, true);
        System.out.println();

        System.out.println(snake.getName());
        snake.voice();
        System.out.println();

        System.out.println(dog.getName());
        dog.voice();
        System.out.println();

        System.out.println(patrolDog.getName());
        patrolDog.voice();
        System.out.println();

        System.out.println(cat.getName());
        cat.voice();
        System.out.println();

        System.out.println(fish.getName());
        fish.voice();
        System.out.println();

        Pickup pickup = new Pickup();
        Sedan sedan = new Sedan();
        Truck truck = new Truck();

        pickup.moveTo(20);
        pickup.moveTo("Коля", 20);
        sedan.moveTo("Влад", 200);
        truck.moveTo(15);

    }
}
