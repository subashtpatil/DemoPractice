package Strings;

/*Java String charAt() example to count the occurrence of a character
In this example, we will use the charAt() method to count the occurrence of a particular
character in the given string. Here we have a string and we are counting the occurrence
of character ‘B’ in the string.*/
public class CountOccurenceOfCharacter {
    public static void main(String[] args) {
        String str = "BeginnersBook B";

        //initialized the counter to 0
        int counter = 0;

        for (int i=0; i<=str.length()-1; i++) {
            if(str.charAt(i) == 'B') {
                //increasing the counter value at each occurrence of 'B'
                counter++;
                /*int cnt =1;
                cnt++;*/
                System.out.println(" B occured at index : " +i);

            }
        }
        System.out.println("Char 'B' occurred "+counter+" times in the string");
    }
}
