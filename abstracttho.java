abstract class Animal {

    // Instance variables
    String name;
    String color;
    double weight;

    // Constructors
    Animal() { }

    Animal(String name, String color) {
        this(name, color, 0.0);
    }

    Animal(String name, String color, double weight) {
        this.name = name;
        this.color = color;
        this.weight = weight;
    }

    // Concrete method
    public void eat() {
        System.out.println(name + " eats.");
    }

    // Abstract method
    public abstract void makeSound();
}
class Bird extends Animal {

    public Bird() {
        name = "Bird";
    }

    @Override
    public void makeSound() {
        System.out.println("Chirp");
    }
}
class Tiger extends Animal {

    public Tiger() {
        name = "Tiger";
    }

    @Override
    public void makeSound() {
        System.out.println("Roar");
    }
}
class Dog extends Animal {

    public Dog() {
        name = "Dog";
    }

    @Override
    public void makeSound() {
        System.out.println("Bark");
    }
}
public class TestAbstractClass {

    public static void main(String[] args) {

        // Polymorphism
        Animal b = new Bird();
        Animal t = new Tiger();
        Animal d = new Dog();

        // Calling concrete method
        b.eat();
        t.eat();
        d.eat();

        // Calling overridden abstract method
        b.makeSound();
        t.makeSound();
        d.makeSound();
    }
}
