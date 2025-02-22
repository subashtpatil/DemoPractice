package Strings;

/*
This method returns boolean value as true if the specified string or sequence of characters
passed as parameter matches to the given string object. otherwise it returns false.
Remember contains() method is case sensitive.
If the CharSequence is null then it method throws 'NullPointerException'.
*/

public class StringContainsExample {

    public static void main(String args[]) {

        String s = "Hello Java";
        System.out.println(s.contains("Hello Java"));// returns true
        System.out.println(s.contains("Java"));//true as Java is present in the given String
        System.out.println(s.contains("hello Java"));//false - as contains() method is case sensitive.
        System.out.println(s.contains("o"));//true
        System.out.println(s.contains("aa"));//false as 'aa' is not present,

        //if else example
        String str = "Java String example";
        if (str.contains("example")) {
            System.out.println("Success - String found");
        } else {
            System.out.println("Failed - String not found");
        }
    }
}

