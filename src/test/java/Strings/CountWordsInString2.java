package Strings;

import java.util.Scanner;

public class CountWordsInString2 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the string");
        String str = s.nextLine();
        // calling the method to count the number of words in a string
        int cnt = countWordsUsingSplit(str);
        System.out.println("Number of words in string are -  " + cnt);
    }

    public static int countWordsUsingSplit(String input) {
        if (input == null || input.isEmpty()) {
            return 0;
        }
        String[] words = input.split("\\s+");

        return words.length;
    }
}

