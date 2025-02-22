package Encapsulation;

public class Test {
    public static void main(String[] args)
    {
        Duck d = new Duck();
        d.setSize(45);
        System.out.println("the encapsulated size" +
                d.getSize());
        d.display();
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
