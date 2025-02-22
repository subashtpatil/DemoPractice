package Strings;

public class StringSplitExample {

        public static void main(String[] args) {
            String s = "Java String Split Example";
            String[] str1 = s.split(" ");
            for (int i = 0; i < str1.length; i++) {
                System.out.println(str1[i]); // output
                //Java
                //String
                //Split
                //Example
            }


            System.out.println("Split with limit , will split the string based on the limit we specify");
            //Split with limit -
            //it will split the string based on the limit we specify
            String[] str2 = s.split(" ", 3);
            for (int i = 0; i < str2.length; i++) {
                System.out.println(str2[i]); // output
                // Java
                //String Split Example
            }
        }
    }
