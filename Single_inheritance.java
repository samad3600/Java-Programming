// Parent class
class Animal {
    void eat() {
        System.out.println("This animal eats food.");
    }
}

// Child class inheriting from Animal
class Dog extends Animal {
    void bark() {
        System.out.println("This dog barks.");
    }
}

public class SingleInheritance {
    public static void main(String[] args) {
        Dog myDog = new Dog();
        myDog.eat();  // Calling method from parent class
        myDog.bark(); // Calling method from child class
    }
}
