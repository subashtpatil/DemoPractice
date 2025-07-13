package ArrayLists;


public class StringToIntConversion {

public static void main(String[] args)
{
    String s = "12345";
    //String s = "subhas";

    // Convert the string to an integer  using Integer.parseInt()
    int n = Integer.parseInt(s);

    System.out.println("Converted String to int : " + n);
    //2ND METHOD
    // Convert String to Integer using valueOf()
    String t = "217";

    // Convert the string to an Integer object
    // using Integer.valueOf()
    int p = Integer.valueOf(t);

    System.out.println("Using 2nd method, Converted String to int" + p);

    // CONVERT INTEGER TO STRING
    int number= 11;
    String str =String.valueOf(number);
    System.out.println("CONVERT INTEGER TO STRING : " + str);

    // CONVERT INTEGER TO STRING 2nd method
    int number2= 1111;
    String str2 =Integer.toString(number2);
    System.out.println("CONVERT INTEGER TO STRING 2nd method  : " + str2);
}
}
