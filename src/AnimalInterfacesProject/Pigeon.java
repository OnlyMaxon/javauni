public class Pigeon extends Animal implements AnimalBehavior, AnimalMove {
    public Pigeon(String name) {
        super(name);
    }

    @Override
    public void sleep() {
        System.out.println("Pigeon sleeps in its nest.");
    }

    @Override
    public void move() {
        System.out.println("Pigeon flies.");
    }
}
