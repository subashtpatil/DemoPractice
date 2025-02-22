
package MethodOverRiding;

public class OverRiding {
}
/*
Overriding in Java
Last Updated : 03 Jan, 2025
Overriding in Java occurs when a subclass implements a method which is already
defined in the superclass or Base Class. The method in the subclass must have
the same signature as in the superclass. It allows the subclass to modify the inherited methods.

        Example: Below is an example of how overriding works in Java.
// Example of Overriding in Java
class Animal {
        // Base class
    void move() { System.out.println(
            "Animal is moving."); }
    void eat() { System.out.println(
            "Animal is eating."); }

}

class Dog extends Animal {

    @Override void move()
{ // move method from Base class is overriden in this
        // method
        System.out.println("Dog is running.");
    }

    void bark() { System.out.println("Dog is barking."); }
}


public class Geeks {
    public static void main(String[] args)
    {
        Dog d = new Dog();
        d.move(); // Output: Dog is running.
        d.eat(); // Output: Animal is eating.
        d.bark(); // Output: Dog is barking.

    }

}

Output
Dog is running.
Animal is eating.
Dog is barking.
        Explnation: The Animal class defines base functionalities like move() and eat().t he Dog class inherits from Animal and overrides the move() method to provide a specific behavior Dog is running. Both classes can access their own methods. When creating a Dog object, calling move() executes the overridden method.



Method Overriding in Java
Method overriding is a key concept in Java that enables Run-time polymorphism. It allows a subclass to provide its specific implementation for a method inherited from its parent class. The actual method executed is determined by the object’s runtime type, not just the reference variable’s type. This dynamic behaviour is crucial for creating flexible and extensible object-oriented designs.

Example: Below is the implementation of the Java Method Overriding


// Java program to demonstrates
// method overriding in java
class Parent {
        // base class or superclass which is going to overriden
        // below
    void show() { System.out.println("Parent's show()"); }
}
// Inherited class
class Child extends Parent {
        // This method overrides show() of Parent
    @Override void show()
    {
        System.out.println("Child's show()");
    }
}
// Driver class
class Geeks {
    public static void main(String[] args)
    {
        // If a Parent type reference refers
        // to a Parent object, then Parent's
        // show is called
        Parent obj1 = new Parent();
        obj1.show();
        // If a Parent type reference refers
        // to a Child object Child's show()
        // is called. This is called RUN TIME
        // POLYMORPHISM.
        Parent obj2 = new Child();
        obj2.show();
    }
}

*/
/*
Output
Parent's show()
Child's show()
Explanation: in this code the Child class inherits from the Parent class and overrides the show() method,
providing its own implementation. When a Parent reference points to a Child object, the Child’s
overridden show() method is executed at runtime, showcasing the principle of polymorphism in Java.

Rules for Java Method Overriding
1. The Overriding and Access Modifiers
An overriding method’s access modifier in a subclass can be more permissive (e.g., protected to the public)
than the overridden method in the superclass. However, reducing the access level
        (e.g., making a protected method private) is not allowed and will result in a compile-time error.*/

