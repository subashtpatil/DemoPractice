package DiffElements;

/*If you want to reverse the characters in the words
but not the words in a string then the following code works*/

/*Input: i love programming
Output: i evol gnimmargorp*/

//https://www.quora.com/How-do-I-reverse-the-words-in-a-string-using-Java


public class SplittingStringAndReversingEachWord {
    public static void main(String[] args) {
        String str = "i love programming";
        String[] words = str.split(" ");
         String reverseString = "";
        // boolean isWordPresent= false;
        for(String word : words){
           int len = word.length();
          for(int j= len-1; j>=0; j--){
              reverseString = reverseString+word.charAt(j);
          }
            reverseString= reverseString+" ";
        }
        System.out.println("The reversed string is  :  "+reverseString);
        }
}//The reversed string is  :  i evol gnimmargorp


/*public class SplittingStringAndReversingEachWord {
        public static void main(String[] args) {
            String str = "i love programming";
            String[] words = str.split(" ");
            String reverseString = "";
            for(int i = 0; i < words.length; i++) {
                reverseString += reverse(words[i]) + " ";
            }
            System.out.println(reverseString.trim());
        }

        public static String reverse(String word) {
            String reverseWord = "";
            for (int i = word.length() - 1; i >= 0; i--) {
                reverseWord += word.charAt(i);
            }
            return reverseWord;
        }
    }*/

