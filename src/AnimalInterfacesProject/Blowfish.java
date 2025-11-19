public class Blowfish extends Animal implements AnimalBehavior, AnimalMove {
    public Blowfish(String name) {
        super(name);
    }

    @Override
    public void sleep() {
        System.out.println("Blowfish sleeps underwater.");
    }

    @Override
    public void move() {
        System.out.println("Blowfish swims.");
    }
}
