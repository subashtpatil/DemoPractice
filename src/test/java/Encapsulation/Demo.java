package Encapsulation;

// Java program to demonstrate the Encapsulation.
class Person {
    // Encapsulating the name and age
    // only approachable and used using
    // methods defined
    private String name;
    private int age;
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


}

// Driver Class
public class Demo {
    // main function
    public static void main(String[] args)
    {
        // person object created
        Person p = new Person();
        p.setName("Shreyas Patil");
        p.setAge(11);
        // Using methods to get the values from the
        // variables
        System.out.println("Name: " + p.getName());
        System.out.println("Age: " + p.getAge());
    }
}
/*

Encapsulation can be described as the mechanism in
which we “encapsulate” our code in such a way that
it can not be randomly accessed by other code
outside the class.
        • If we want to include encapsulation in our code then
we have to do following things:
        1. Always make instance variable private.
        2. Always make public accessor methods and force
calling code to use these methods instead of
directly calling the instance variables.
3. Use naming convention set() and get() for these
methods.*/
