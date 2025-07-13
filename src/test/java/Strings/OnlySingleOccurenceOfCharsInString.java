package Strings;

import java.util.HashMap;

public class OnlySingleOccurenceOfCharsInString {

    public static void main(String[] args) {
        String str = "Test_program_hackerearth";
        char[] chars= str.toCharArray();

        HashMap<Character, Integer> hm= new HashMap<Character, Integer>();
        for(char c:  chars){

            if (hm.containsKey(c)){
                hm.put(c, hm.get(c)+1);
            }else{
                hm.put(c, 1);
            }

        }
        System.out.println(hm);

        for (Character x : hm.keySet()){
            if(hm.get(x)<2)  {
                System.out.println("The character that occurs only once is   +  "+x);
            }


        }
    }
}
