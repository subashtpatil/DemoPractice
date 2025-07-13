package Strings;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExWordInString {

    // Method that returns the count of the given
    // character in the string
    //public static int RegExcount(String s, String ch) {
    public static int RegExcount(String s, String word) {
        // Use Matcher class of java.util.regex
        // to match the character
        Matcher matcher= Pattern.compile(String.valueOf(word)).matcher(s);
        //System.out.println((String.valueOf(ch)));

        int res=0;
        while(matcher.find()) {
            res++;
        }
        return res;
    }
    public static void main(String[] args) {

        String str = "subash is a bad bad bad boy";
        String word = "bad";

        System.out.println(RegExcount(str, word));
    }
}