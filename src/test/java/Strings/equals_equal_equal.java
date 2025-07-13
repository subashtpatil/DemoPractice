package Strings;

public class equals_equal_equal {

    public static void main(String[] args) {
        String expected = "Subash";
        String actual = new String("Subash");
        String expected2 = new String("Subash");


        System.out.println(expected == actual);      // false (check by reference)
        System.out.println(expected.equals(actual)); // true  (check by value)

        System.out.println(expected2 == actual);  // false (check by reference)
    }
}
