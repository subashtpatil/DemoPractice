package MethodHiding;

public class Child extends Parent{
    // Hiding
    public static void first() {
        System.out.println("Inside first method in child class");
    }

    // Overriding
    public void bar() {
        System.out.println("Inside bar method in child class");
    }
}
