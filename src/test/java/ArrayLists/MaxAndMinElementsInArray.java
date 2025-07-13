package ArrayLists;

import java.util.ArrayList;
import java.util.List;

public class MaxAndMinElementsInArray {
    public static void main(String[] args) {
        int arr[] = {50, 30, 40, 20, 60};
       int max = arr[0];

       List<Integer> al = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
                al.add(arr[i]);
            }
        }
        System.out.println("Maximum value of element in an array = "+max);

        /// Minimum element in an array
        int arrO[] = {50, 30, 40, 20, 60};
        int min = arrO[0];

        for (int i = 0; i < arrO.length; i++) {
            //if (arrO[i] > max) {
            if (arrO[i] < min) {
                min = arrO[i];
            }
        }
        System.out.println("Minimum value of element in an array = "+min);

    }
}
