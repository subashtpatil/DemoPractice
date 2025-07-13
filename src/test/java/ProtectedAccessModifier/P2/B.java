package ProtectedAccessModifier.P2;


// protected modifier

// importing all classes
// in package p1
import ProtectedAccessModifier.P1.A;
//import P1.*;

// Class B is subclass of A
class B extends A {
    public static void main(String args[]) {
        B obj = new B();
        obj.display();
    }
}
/*Example 2: In this example, we will create two packages, p1 and p2. Class A in p1 has a protected method display.
 Class B in p2 extends A and accesses the protected method through inheritance by creating an object of class B.

 Explanation: The above example demonstrates that a protected method is accessible in a subclass
 from a different package using inheritance.*/

