package Strings;

import java.util.HashMap;
import java.util.Map;

public class DuplicateCharactersInString {
    public static void main(String[] args) {
        String str = "how to doin java com vv";
        char[] chars = str.toCharArray();

        Map<Character, Integer> hm = new HashMap<Character, Integer>();
        for (char c : chars) {

            if (hm.containsKey(c)) {
                hm.put(c, hm.get(c) + 1);
            } else {
                hm.put(c, 1);
            }
        }
        System.out.println(hm);
        for (Character x : hm.keySet()) {
          /* if (hm.get(x) > 1 *//*&& (!Character.isWhitespace(x))*//*) {*/  //this will give count of whitespace as well
            if (hm.get(x) > 1 && (!Character.isWhitespace(x))) {   //this will ignore count of whitespace
          //  if (hm.get(x) > 1 ) {
                System.out.println("Duplicate character is = " + x);

            }

       /* hm.forEach((key, value) -> {
            if(hm.get(key)>1) {

                System.out.println(" Duplicate element is Alphabet = " + key + "   which occurs = " + value+" times");
            }
            });*/
        }
    }}


/*
{ =5, a=2, c=1, d=1, h=1, i=1, j=1, m=1, n=1, o=4, t=1, v=3, w=1}
Duplicate character is = a
Duplicate character is = o
Duplicate character is = v*/
