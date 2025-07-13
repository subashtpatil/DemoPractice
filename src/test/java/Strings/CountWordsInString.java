package Strings;

import java.util.Scanner;

public class CountWordsInString {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Enter the string");
        String str = s.nextLine();
        int cnt = 0;
        for (int i = 0; i < str.length(); i++) {
            if ((str.charAt(i) == ' ') && (str.charAt(i + 1) != ' '))
            {
                cnt = cnt + 1;
            }
        }
        System.out.println("Number of words in String ==" + cnt);
    }
}
