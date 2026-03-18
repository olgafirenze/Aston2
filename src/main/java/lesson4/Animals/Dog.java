package lesson4.Animals;

public class Dog extends Animal {
    private static int dogCount = 0;

    public Dog (String name) {
        this.name = name;
        dogCount++;
    }

    public static int getDogCount () {
        return dogCount;
    }

    public void dogCount () {
        System.out.println( "Создано собак: " + Dog.getDogCount());
    }

    public void dogRun (int a) {
        if ( a <= 500 ) {
            System.out.println(name + " пробежал(а) " + a + " м");
        }
        else {
            System.out.println(name + " не может пробежать большле 500 м");
        }
    }

    public void dogSwim (int b) {
        if ( b <= 10 ) {
            System.out.println(name + " проплыл(а) " + b + " м");
        }
        else {
            System.out.println(name + " не может проплыть большле 10 м");
        }
    }
}
