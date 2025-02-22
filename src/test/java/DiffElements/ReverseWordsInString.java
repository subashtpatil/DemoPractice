package DiffElements;



import java.io.*;
        import java.lang.*;
        import java.util.*;

public class ReverseWordsInString {

    public static void printWords(String str)
    {
        // word variable to store word
        String word;

        // making a string stream
        StringTokenizer iss = new StringTokenizer(str);

        // Read and print each word.
        while (iss.hasMoreTokens()) {
            word = iss.nextToken();
            System.out.print(
                    new StringBuilder(word).reverse().toString()
                            + " ");
        }
    }

    public static void main(String[] args)
            throws java.lang.Exception
    {
        String s = "GeeksforGeeks is good to learn";
        printWords(s);
    }
}

// Contributed by rishabmalhdijo

