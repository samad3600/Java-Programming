class Display {
    // Overloaded method with one parameter
    public void show(int a) {
        System.out.println("Displaying int: " + a);
    }

    // Overloaded method with two parameters
    public void show(String a) {
        System.out.println("Displaying string: " + a);
    }
}

public class TestOverloading {
    public static void main(String[] args) {
        Display obj = new Display();
        obj.show(10);       // Calls the method with int parameter
        obj.show("Hello");  // Calls the method with String parameter
    }
}
