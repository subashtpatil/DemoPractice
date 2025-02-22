package Strings;

import java.util.HashMap;
import java.util.Map;

public class DuplicateCharactersInString {
    public static void main(String[] args) {
        String str = "howtodoin java com vv";
        char[] chars= str.toCharArray();

        Map<Character, Integer> hm = new HashMap<Character, Integer>();
        for(char c :chars){

            if(hm.containsKey(c)){
                hm.put(c,hm.get(c)+1);
            }else{
                hm.put(c,1);
            }
        }
        System.out.println(hm);
        /*for(Character x :hm.keySet()) {
            if(hm.get(x)>1){
                System.out.println("Duplicate element is = "+x);

            }*/

        hm.forEach((key, value) -> {
            if(hm.get(key)>1) {

                System.out.println(" Duplicate element is Alphabet = " + key + "   which occurs = " + value+" times");
            }
            });
        }
    }


