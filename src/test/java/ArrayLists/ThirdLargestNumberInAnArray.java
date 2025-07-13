package ArrayLists;

import java.util.ArrayList;
import java.util.List;

public class ThirdLargestNumberInAnArray {
    public static void main(String args[]){
        int temp, size;
        int [] array= {10, 20, 25, 63, 96, 57};
        size = array.length;

        List<Integer> al = new ArrayList<>();    //arrayList to add all the elements of an array
        for(int i = 0; i<size; i++ ){
            for(int j = i+1; j<size; j++){

                if(array[i]>array[j]){
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
            al.add(array[i]);

        }


        /*for(int i = 0; i<size; i++ ) {
            System.out.println(array[i]);
             al.add(array[i]);
        }*/
        System.out.println(al);
        System.out.println("Third largest number is :: "+array[size-3]);
    }
}