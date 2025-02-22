package Inheritance;

/*Inheritance can be defined as the process where one class acquires the properties
        (methods and fields) of another.
Note − A subclass inherits all the members (fields, methods, and nested classes) from its superclass
 other than private members. Constructors are not members, so they are not inherited by subclasses,
 but the constructor of the superclass can be invoked from the subclass.

 The Superclass reference variable can hold the subclass object, but using that variable you can access
 only the members of the superclass, so to access the members of both classes it is recommended to
  always create reference variable in the subclass.
 */


public class Calculation {

    int z;
    public void addition(int x, int y) {
        z = x + y;
        System.out.println("The sum of the given numbers:"+z);
    }

    public void Subtraction(int x, int y) {
        z = x - y;
        System.out.println("The difference between the given numbers:"+z);
    }

}
