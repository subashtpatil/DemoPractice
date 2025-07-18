package Strings;


public class IndexOfExample{
    public static void main(String args[]) {
        String str1 = new String("This is a BeginnersBook tutorial");
        String str2 = new String("Beginners");
        String str3 = new String("Book");
        String str4 = new String("Books");
        System.out.println("Index of B in str1: "+str1.indexOf('B'));
        System.out.println("Index of B in str1 after 15th char:"+str1.indexOf('B', 15));
        System.out.println("Index of B in str1 after 30th char:"+str1.indexOf('B', 30));
        System.out.println("Index of string str2 in str1:"+str1.indexOf(str2));
        System.out.println("Index of str2 after 15th char"+str1.indexOf(str2, 15));
        System.out.println("Index of string str3:"+str1.indexOf(str3));
        System.out.println("Index of string str4"+str1.indexOf(str4));
        System.out.println("Index of hardcoded string:"+str1.indexOf("is"));
        System.out.println("Index of hardcoded string after 4th char:"+str1.indexOf("is", 4));

        String str = "Java String";
        char ch = 'J';
        char ch2 = 'S';
        String subStr = "tri";
        int posOfJ = str.indexOf(ch);
        int posOfS = str.indexOf(ch2);
        int posOfSubstr = str.indexOf(subStr);
        System.out.println(posOfJ);
        System.out.println(posOfS);
        System.out.println(posOfSubstr);


    }
}

/*
Index of B in str1: 10
Index of B in str1 after 15th char:19
Index of B in str1 after 30th char:-1
Index of string str2 in str1:10
Index of str2 after 15th char-1
Index of string str3:19
Index of string str4-1
Index of hardcoded string:2
Index of hardcoded string after 4th char:5*/
