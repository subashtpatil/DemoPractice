package Inheritance;

public class MultilevelInheritanceExample {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.eat();  // From Animal class
        dog.walk(); // From Mammal class
        dog.bark(); // From Dog class
    }
}
