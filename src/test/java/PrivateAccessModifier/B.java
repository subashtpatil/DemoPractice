/*
package PrivateAccessModifier;

// Class B
class B {
    public static void main(String args[]) {
        A obj = new A();

        // Trying to access private method
        // of another class A
        obj.display();          //'display()' has private access in 'PrivateAccessModifier.A'
    }
}

*/
/*
2. Private Access Modifier
The private access modifier is specified using the keyword private. The methods or data members declared as private
are accessible only within the class in which they are declared.

Any other class of the same package will not be able to access these members.
Top-level classes or interfaces can not be declared as private because,
private means “only visible within the enclosing class”.
protected means “only visible within the enclosing class and any subclasses”.
Hence these modifiers in terms of application to classes, apply only to nested classes and not
on top-level classes.

Example: In this example, we will create two classes A and B within the same package p1.
We will declare a method in class A as private and try to access this method from class B and see the result.

Explanation: The above code will show a compile-time error when trying to access a private method from class B,
        even within the same package.*/
