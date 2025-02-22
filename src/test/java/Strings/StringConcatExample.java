package Strings;

public class StringConcatExample {

/*Syntax: String concate(String str);
In order to concatenate multiple strings, we use concat() method in Java.
We can also do String concatenation using + Operator, using StringBuilder and StringBuffer class to join Strings in Java.
Example:
      */

    public static void main(String args[]) {

        //using string.concat
        String s1="Hello";
        String s2="all";
        System.out.println(s1.concat(s2)); // Helloall --
        //adds second object's string to first object's end of string without any spaces.

        //using + operator to concatenate String
        String first = "Raj";
        String last = "Chris";

        String name = first + " " + last;
        System.out.println(name);

        //using StringBuilder
        StringBuilder strBuilder = new StringBuilder(14);
        strBuilder.append(first).append(" ").append(last);
        System.out.println(strBuilder.toString());

        //using StringBuffer
        StringBuffer strBuffer = new StringBuffer(15);
        strBuffer.append(first).append(" ").append(last);
        System.out.println(strBuffer.toString());
    }
}

