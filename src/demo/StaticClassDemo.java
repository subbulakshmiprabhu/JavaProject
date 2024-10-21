package demo;

class OuterClass {

    // Static nested class
    static class StaticNestedClass {
        void display() {
            System.out.println("This is a static nested class.");
        }
    }
}

public class StaticClassDemo {
    public static void main(String[] args) {
        // Creating an instance of the static nested class
        OuterClass.StaticNestedClass nested = new OuterClass.StaticNestedClass();
        nested.display();
    }
}