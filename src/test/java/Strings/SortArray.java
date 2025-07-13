package Strings;



public class SortArray {
    public static void main(String[] args) {

        int[] arr = {4, 5, 2, 3, 1};
        int temp = 0;    //Temporary variable to store the element


        for (int i = 0; i < arr.length; i++)//Holds each Array element
        {
            for (int j = i + 1; j < arr.length; j++)    //compares with remaining Array elements
            {
                if (arr[i] > arr[j]) //Compare and swap         // if (arr[i] < arr[j])  sorts in descending order
                {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

      //  System.out.println(arr);

    //Displaying elements of array after sorting
        System.out.println("Elements of array sorted in ascending order: ");
        for (int i = 0; i < arr.length; i++)
    {
        System.out.print(arr[i] + " ");
    }
    }
}

