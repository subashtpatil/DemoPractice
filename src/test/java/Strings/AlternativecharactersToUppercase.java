package Strings;




import org.checkerframework.checker.units.qual.C;

import java.util.Scanner;
public class AlternativecharactersToUppercase {
    public static void main(String[] args) {
       /* Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string :");
        String str = sc.nextLine();
        str = str.toLowerCase();
        char[] ch = str.toCharArray();
        for(int i=0; i<ch.length; i=i+2){
            ch[i] = Character.toUpperCase(ch[i]);
            System.out.println(ch[i]);
        }
//        System.out.println(new String(ch));
        System.out.println(ch);*/
/*
//METHOD 2
        String str2 = "subash";
        int len = str2.length();
        StringBuilder result = new StringBuilder();
        for(int i=0; i<len; i++){
            if (i % 2 == 0) {%
                result.append(Character.toUpperCase(str2.charAt(i)));
            } else {
                result.append(str2.charAt(i));
            }
        }
//        System.out.println(new String(ch));
        System.out.println("Result = "+result);*/


        //Method 3:

        String str3 = "Subash Patil";
        int len3 = str3.length();
        StringBuilder result2 = new StringBuilder();
        for(int i=0; i<len3; i++){
           result2.append(Character.toLowerCase(str3.charAt(i)));

        }
//        System.out.println(new String(ch));
        System.out.println("Result = "+result2);
    }
}