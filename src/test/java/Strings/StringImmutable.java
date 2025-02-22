package Strings;



/*Strings are immutable :-
Immutable means changes made to existing object will not be affected to the object.
If we want to make any changes to the existing object, we need to create a new object,
so that the changes are affected to the new object.
        Example:*/


import org.apache.xmlbeans.impl.xb.xsdschema.Public;

public class StringImmutable {
    public static void main(String[] args) {
      String s= new String("Hello");
        s.concat("Java");
        System.out.println(s);// prints Hello

        /*
In the above program we are concatenating the string object but concatenation
is not done to the object 's' and prints just 'Hello' but not 'Hello Java'.
*/



        //The same can be achieved by using the below :
        String S= new String("Hello");
        String s1;
        s1=S.concat("Java");
        System.out.println(S);// prints Hello
        System.out.println(s1);// prints Hello Java
       /* Difference between String literal and creating String object with new operator:
        String s="Hello"; Here compiler creates a single String object in String Constant Pool with the value "Hello"*/

    }
}
