package Strings;

public class IndexOfExample2 {

    public static void main(String[] args) {
      /*  String str = "abcbdbe";
        String b = "b";
        int index = str.indexOf(b, str.indexOf(b) + 1);
        System.out.println(index); // Output: 3*/


       /* String str1 = "abcde";
        String b = "b";
        int index2 = str1.indexOf(b, str1.indexOf(b) + 1);
        System.out.println(index2); // Output: -1
    }*/

        String str = "abcbdbefgfb";
        int len = str.length();
        /*String b = "b";
        int index = str.indexOf(b, str.indexOf(b, str.indexOf(b) + 1));
        System.out.println(index); // Output: 3*/
        int cnt =0;
        for(int i=0; i<len;i++){
            if(str.charAt(i)=='b'){

                System.out.println("b occurs at index = "+i);
                cnt=cnt+1;
            }

        }

        System.out.println("total number of b's  in the string are = "+ cnt);
    }
}
