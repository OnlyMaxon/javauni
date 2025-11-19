package animals;

public class Fish extends Animal {
    private String waterType; // e.g., freshwater or saltwater

    
    public Fish() {}
    public Fish(String name, int age, double weight, String waterType) {
        super(name, age, weight);
        this.waterType = waterType;
    }
    public Fish(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println(name + " nibbles on algae or smaller fish.");
    }

    @Override
    public void getVoice() {
        System.out.println(name + " makes bubbling sounds.");
    }

    public void swim() {
        System.out.println(name + " is swimming!");
    }

    public String getWaterType() { return waterType; }
    public void setWaterType(String waterType) { this.waterType = waterType; }

    @Override
    public String toString() {
        return super.toString() + ", waterType='" + waterType + "'";
    }
}
public class Fish extends Animal implements AnimalBehavior, AnimalMove {
    public Fish(String name) {
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
