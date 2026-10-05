package polymorphism;

class Animal {
    public void sound() {
        System.out.println("Animal makes sound...");
    }
}

class Dog extends Animal {
    public void sound() {
        System.out.println("Dog barks...");
    }
}

public class OverridingExample1 {
    static void main() {
        Dog dog = new Dog();

        dog.sound();

        dog.sound();
    }
}
