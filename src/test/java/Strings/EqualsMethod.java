package Strings;

/*As you can observe in the output that when we compared the String str1 (value “Hello”)
with the string “hello”, the equals() method returned false because this method is case sensitive
and considers the case while comparing strings. On the other hand the equalsIgnoreCase() method
compares strings while ignoring their cases, which we will see in the next section.*/


public class EqualsMethod{
    public static void main(String args[]){
        String str1= new String("Hello");
        String str2= new String("Hi");
        String str3= new String("Hello");
        System.out.println("str1 equals to str2:"+str1.equals(str2));
        System.out.println("str1 equals to str3:"+str1.equals(str3));
        System.out.println("str1 equals to Welcome:"+str1.equals("Welcome"));
        System.out.println("str1 equals to Hello:"+str1.equals("Hello"));
        System.out.println("str1 equals to hello:"+str1.equals("hello"));
    }
}

/*str1 equals to str2:false
str1 equals to str3:true
str1 equals to Welcome:false
str1 equals to Hello:true
str1 equals to hello:false*/
