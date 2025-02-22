package DiffElements;

import java.util.ArrayList;
import java.util.List;

public class ReverseEachWordOfString {
    public static void main(String[] args) {
        String str = "I am learning Java";
        String[] words = str.split(" ");

        String reverseString = "";
        List<String> strWords = new ArrayList<String>();

        for (int i = words.length-1 ; i>=0; i--) {
            strWords.add(words[i]);

       /* String reverseWord = "";

        for (int j = word.length()-1; j >= 0; j--)
        {
            reverseWord = reverseWord + word.charAt(j);
        }

        reverseString = reverseString + reverseWord + " ";*/
        }
        System.out.println(strWords);
    }
}

