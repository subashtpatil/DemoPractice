package Strings;

public class   DuplicateCharacters {
    public static void main(String argu[]) {
        String str = "beautiful sea uu";
        char[] chars = str.toCharArray();
        System.out.println("The string is: " + str);
        System.out.print("Duplicate Characters in above string are: ");
        // nested for loop to print duplicate characters
        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j < str.length(); j++) {
                if (chars[i] == chars[j]) {
                    System.out.print(chars[i] + " ");
                    break;
                }
            }
        }
    }
}