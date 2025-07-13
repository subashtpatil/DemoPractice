package DiffElements;

import java.util.Scanner;

public class Pallindrome {
    public static void main(String args[]) {
        String str, str2 ="" ;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the string you want to check:");
        str = s.nextLine();
        int len = str.length();
        for (int i = len-1; i >= 0; i--) {
            str2 = str2 + str.charAt(i);
        }
        if (str.equalsIgnoreCase(str2)) {
            System.out.println("The string is palindrome.");
        } else {
            System.out.println("The string is not a palindrome.");
        }
    }
}

