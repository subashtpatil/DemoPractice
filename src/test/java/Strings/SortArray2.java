package Strings;

public class SortArray2  {
    public static void main(String[] args) {

        char[] chars = {'d', 'e', 'b', 'a', 'c'};
        char temp = 0;    //Temporary variable to store the element


        for (int i = 0; i < chars.length; i++)//Holds each Array element
        {
            for (int j = i + 1; j < chars.length; j++)    //compares with remaining Array elements
            {
                if (chars[i] > chars[j]) //Compare and swap         // if (arr[i] < arr[j])  sorts in descending order
                {
                    temp = chars[i];
                    chars[i] = chars[j];
                    chars[j] = temp;
                }
            }
        }

        //System.out.println(arr);

        //Displaying elements of array after sorting
        System.out.println("Elements of array sorted in ascending order: ");
        for (int i = 0; i < chars.length; i++)
        {
            System.out.print(chars[i] + " ");
        }
    }
}

