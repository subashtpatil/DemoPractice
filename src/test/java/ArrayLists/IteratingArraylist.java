package ArrayLists;

import java.util.ArrayList;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class IteratingArraylist {
    public static void main(String args[]) {
        ArrayList<String> names = new ArrayList<String>();
        names.add("Subash");
        names.add("Amrita");
        names.add("Varun");
        names.add("Shreyas");
        names.add("Patil");

        //iterating ArrayList
        for (String name : names) {
            System.out.println(name);
        }
        // Sorting an ArrayList using Collections.sort() method
        Collections.sort(names);

        System.out.println("After Sort  : " + names);

        Collections.sort(names, Collections.reverseOrder());

        System.out.println("Sorting in reverse order : " + names);

        names.sort(Comparator.naturalOrder());
        System.out.println("Comparator Sorted Names naturalOrder : " + names);

        names.sort(Comparator.reverseOrder());
        System.out.println("Comparator Sorted Names  Reverse order : " + names);
    }
}
