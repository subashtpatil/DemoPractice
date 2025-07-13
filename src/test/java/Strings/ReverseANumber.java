package Strings;

import java.util.Scanner;

public class ReverseANumber {

    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number to be reversed");
        int num = s.nextInt();
        // Using StringBuffer class
        StringBuffer sb = new StringBuffer(String.valueOf(num));
        StringBuffer rev = sb.reverse();
        System.out.println("The reversed number is  " + rev);

        /// /========================================================
       /* METHOD TWO*/
        Scanner sC = new Scanner(System.in);
        System.out.println("Enter the number to be reversed");
        int num2 = sC.nextInt();
        int rev2 = 0;

        while (num2 != 0) {
            rev2 = rev2 * 10 + num % 10;
            num = num / 10;
        }
        System.out.println("The reversed number is  " + rev2);
    }
}
