class Animal {
    // Method in the parent class
    public void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    // Overriding the sound() method in the child class
    @Override
    public void sound() {
        System.out.println("Dog barks");
    }
}

public class TestOverriding {
    public static void main(String[] args) {
        Animal myAnimal = new Animal(); // Animal reference and object
        Animal myDog = new Dog();       // Animal reference but Dog object

        myAnimal.sound(); // Calls the method in Animal class
        myDog.sound();    // Calls the overridden method in Dog class
    }
}
