package Collections;

import java.util.ArrayList;
import java.util.Collections;
/*

Why ArrayList is better than Array?
The limitation with array is that it has a fixed length so if it is full you cannot
add any more elements to it, likewise if there are number of elements gets removed from it
the memory consumption would be the same as it doesn’t shrink.
On the other ArrayList can dynamically grow and shrink after addition and removal of elements
        (See the images below). Apart from these benefits ArrayList class enables us to use predefined
        methods of it which makes our task easy. Let’s see the diagrams to understand
the addition and removal of elements from ArrayList and then we will see the programs.
*/


public class SortingUsinArrayList {




        public static void main(String args[]){
            ArrayList<String> listofcountries = new ArrayList<String>();

            //Checking whether the list is empty
            System.out.println("Is ArrayList Empty: "+listofcountries.isEmpty());

            listofcountries.add("India");
            listofcountries.add("US");
            listofcountries.add("China");
            listofcountries.add("Denmark");
            listofcountries.add("Pakistan");

            /*Unsorted List*/
            System.out.println("Before Sorting:");
            for(String country: listofcountries){
                System.out.println(country);
            }

            //Kickout Pakistan
            listofcountries.remove("Pakistan");
            System.out.println("Pakistan kicked Out");

            /* Sort statement*/
        //    Collections.sort(listofcountries);


            /* Sorting in decreasing order*/
            Collections.sort(listofcountries, Collections.reverseOrder());


            /* Sorted List*/
            System.out.println("After Sorting:");
            for(String country2: listofcountries){
                System.out.println(country2);
            }

        /*    It is used for removing all the elements of the array list in one go.
                    The below code will remove all the elements of ArrayList whose object is obj.*/
            listofcountries.clear();
            System.out.println("Clearing the arrayList");

            //Checking whether the list is empty
            System.out.println("Is ArrayList Empty: "+listofcountries.isEmpty());
        }
    }

