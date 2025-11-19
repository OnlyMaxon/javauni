public class Dog extends Animal implements AnimalBehavior, AnimalMove {
    public Dog(String name) {
        super(name);
    }

    @Override
    public void sleep() {
        System.out.println("Dog sleeps peacefully.");
    }

    @Override
    public void move() {
        System.out.println("Dog runs.");
    }
}
