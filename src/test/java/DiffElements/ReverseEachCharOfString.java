package DiffElements;

import java.util.ArrayList;
import java.util.List;


public class ReverseEachCharOfString {
    public static void main(String[] args) {
        String str = "I am learning Java";
//// METHOD 1
        String reverseString = "";

        for (int i= str.length()-1 ; i>=0; i--) {
            reverseString= reverseString+(str.charAt(i));

              }
        System.out.println(reverseString);
    }
     /*   //// METHOD 2
        StringBuffer sb = new StringBuffer(str);
        System.out.println(sb.reverse());*/

   // }
}