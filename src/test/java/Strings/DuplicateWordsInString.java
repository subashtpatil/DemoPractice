package Strings;

import java.util.HashMap;

public class DuplicateWordsInString {

    public static void main(String[] args)  {
        String str = "This is testing Program , a , testing Program";
        String[] words=str.split("\\s");

        HashMap<String, Integer> hm = new HashMap<String, Integer>();

        for (String word: words) {


            if (hm.containsKey(word)) {
                hm.put(word, hm.get(word) + 1);

            } else {
                hm.put(word, 1);
            }
        }

        System.out.println(hm);
        for (String myword:hm.keySet())
        {
            if(hm.get(myword)> 1)
            {
                System.out.println("Duplicate word is :  "+myword);
            }

        }
    }
}

