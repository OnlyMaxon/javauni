public class Main {
    public static void main(String[] args) {

        AnimalBehavior[] behaviors = {
            new Dog("Buddy"),
            new Pigeon("Sky"),
            new Blowfish("Bubbles")
            new Fish("Nemo")
            new Mammal("Leo")
            new Bird("Tweety")
        };

   
        System.out.println("=== Sleep behaviors ===");
        for (AnimalBehavior ab : behaviors) {
            ab.sleep();
        }

  
        Animal[] animals = {
            new Dog("Buddy"),
            new Pigeon("Sky"),
            new Blowfish("Bubbles")
            new Fish("Nemo")
            new Mammal("Leo")
            new Bird("Tweety")

        };

        System.out.println("\n=== Movement behaviors ===");
        for (Animal a : animals) {
            if (a instanceof AnimalMove) {
                ((AnimalMove) a).move();
            }
        }

        System.out.println("\n=== Names ===");
        for (Animal a : animals) {
            AnimalName.name(a.getName());
        }
    }
}
