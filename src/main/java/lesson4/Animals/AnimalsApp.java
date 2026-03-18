package lesson4.Animals;

import java.util.ArrayList;

public class AnimalsApp {
    private static ArrayList<Cat> cats = new ArrayList<>();

    public static void main(String[] args) {
        Animal animal = new Animal( "Барсик" );
        Cat cat1 = new Cat( "Мурзик" );
        Cat cat2 = new Cat( "Марсик" );
        Cat cat3 = new Cat( "Пуша" );
        Dog dog1 = new Dog( "Бобик" );
        Dog dog2 = new Dog( "Бублик" );
        Bowl bowl = new Bowl(15);
        animal.run(201);
        animal.swim(100);
        cat1.catRun(78);
        cat1.catSwim(15);
        dog1.dogRun(1);
        dog1.dogSwim(11);
        cat3.catEat(20, bowl);
        cats.add(new Cat("Васька"));
        cats.add(new Cat("Пушок"));
        cats.add(new Cat("Маркиз"));
        cats.get(cats.size() - 1).catRun(2);
        for (Cat cat : cats) {
            cat.catEat(7, bowl);
        }
        cat1.catCount();
        dog1.dogCount();
        animal.animalCount();
    }
}
