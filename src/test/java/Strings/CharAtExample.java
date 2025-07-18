package Strings;

public class CharAtExample {
    public static void main(String args[]) {
        String str = "Welcome to string handling tutorial";
        //This will return the first char of the string
        char ch1 = str.charAt(0);

        //This will return the 6th char of the string
        char ch2 = str.charAt(5);

        //This will return the 12th char of the string
        char ch3 = str.charAt(11);

        //This will return the 21st char of the string
        char ch4 = str.charAt(20);

        //    IndexOutOfBoundsExceptionExample
        //char ch5 = str.charAt(50);
        System.out.println("Character at 0 index is: "+ch1);
        System.out.println("Character at 5th index is: "+ch2);
        System.out.println("Character at 11th index is: "+ch3);
        System.out.println("Character at 20th index is: "+ch4);
    }
    }



/*
Character at 0 index is: W
Character at 5th index is: m
Character at 11th index is: s
Character at 20th index is: n
*/
