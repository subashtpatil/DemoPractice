package LinkedLists;

import java.util.ArrayList;
import java.util.LinkedList;

/*
boolean addAll(Collection c): It adds all the elements of the specified collection c to the list.
It throws NullPointerException if the specified collection is null. Consider the below example –

This piece of code would add all the elements of ArrayList to the LinkedList.
*/


public class LLToArrayList {
    public static void main(String[] args) {

        LinkedList<String> llistobj = new LinkedList<String>();
        ArrayList<String> arraylist = new ArrayList<String>();
        arraylist.add("String1");
        arraylist.add("String2");
        llistobj.addAll(arraylist);

        System.out.println("Items from ArrayList added to LinkedList :  "+ llistobj);
        //System.out.println(arraylist);

       /* 8) Object clone(): It returns the copy of the list.
                For e.g. My linkedList has four items: text1, text2, text3 and text4.*/
        Object str= llistobj.clone();
        System.out.println("Cloned object of linkedList is  :  "+str);



    }


}
