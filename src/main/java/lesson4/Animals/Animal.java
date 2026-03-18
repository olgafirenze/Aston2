package lesson4.Animals;

public class Animal {
    private static int animalCount = 0;

    String name;
    public Animal () {
            }
    public Animal (String name) {
        this.name = name;
        animalCount++;
    }

    public static int getAnimalCount () {
        return animalCount;
    }

    public void animalCount () {
        System.out.println( "Создано всех животных: " + ( Animal.getAnimalCount() + Cat.getCatCount() + Dog.getDogCount()));
    }

    public void run (int a) {
        System.out.println(name + " пробежал(а) " + a + " м");
    }

    public void swim (int b) {
        System.out.println(name + " проплыл(а) " + b + " м");
    }
}

