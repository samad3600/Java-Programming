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

// Grandchild class inheriting from Dog
class Puppy extends Dog {
    void weep() {
        System.out.println("This puppy weeps.");
    }
}

public class MultilevelInheritance {
    public static void main(String[] args) {
        Puppy myPuppy = new Puppy();
        myPuppy.eat();  // Calling method from grandparent class
        myPuppy.bark(); // Calling method from parent class
        myPuppy.weep(); // Calling method from child class
    }
}
