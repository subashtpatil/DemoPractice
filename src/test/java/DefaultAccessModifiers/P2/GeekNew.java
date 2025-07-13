/*
package DefaultAccessModifiers.P2;

// error while using class from different
// package with default modifier

import DefaultAccessModifiers.P1.Geek;
import DefaultAccessModifiers.P1.*;    // importing package p1

// This class is having
// default access modifier
class GeekNew {
    public static void main(String args[]) {
//DefaultAccessModifiers. P1.Geek' is not public in 'DefaultAccessModifiers. P1'.
// Cannot be accessed from outside package
        // Accessing class Geek from package p1
        Geek obj = new Geek();

        obj.display();
    }
}

*/
/*
1. Default Access Modifier
        When no access modifier is specified for a class, method, or data member,
        it is said to be having the default access modifier by default.
        The default access modifiers are accessible only within the same package.*/

