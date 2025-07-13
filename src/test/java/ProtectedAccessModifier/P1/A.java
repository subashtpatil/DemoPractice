package ProtectedAccessModifier.P1;

// protected access modifier


// Class A
public class A {
    protected void display() {
        System.out.println("GeeksforGeeks");
    }
}
/*

3. Protected Access Modifier
The protected access modifier is specified using the keyword protected. The methods or data members declared as protected
are accessible within the same package or subclasses in different packages.

        Example 1: In this example, we will create two packages p1 and p2. Class A in p1 is made public,
to access it in p2. The method display in class A is protected and class B is inherited from class A
        and this protected method is then accessed by creating an object of class B.*/
