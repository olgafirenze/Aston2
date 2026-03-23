package lesson4.Animals;

public class Cat extends Animal {
   private static int catCount = 0;

    private boolean satiety;

    public Cat (String name, boolean satiety) {
        this.name = name;
        this.satiety = satiety;
        catCount++;
    }
   
    public Cat (String name) {
        this(name, false);
    }

    public static int getCatCount () {
        return catCount;
    }

    public void catCount () {
        System.out.println( "Создано котов: " + Cat.getCatCount() );
    }

    public void catRun (int a) {
        if ( a <= 200 ) {
            System.out.println(name + " пробежал(а) " + a + " м");
        }
            else {
            System.out.println(name + " не может пробежать большле 200 м");
            }
        }

    public void catSwim (int b) {
        System.out.println(name + " не умеет плавать");
    }

    public void catEat (int eat, Bowl bowl) {
        if ( eat <= bowl.food ) {
            this.satiety = true;
            bowl.food -= eat;
            System.out.println( name + " поел(а)." );
        }
        else {
            System.out.println( "Для " + name + " в миске недостаточно еды." );
        }
    }

}
