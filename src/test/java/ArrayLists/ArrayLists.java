package ArrayLists;

import java.util.ArrayList;

public class ArrayLists {


        public static void main(String[] args) {
            //To an arrayList u can add any number or any type of values
            //stores values on basis of index
            ArrayList ar= new ArrayList();
            ar.add(100);  //0
            ar.add(200);  //1
            ar.add(300);  //2
            System.out.println(ar.size());

            ar.add(400);  //3
            ar.add(500);  //4
            System.out.println(ar.size());
            ar.add("Tom");  //5
            ar.add("Hello");  //6
            ar.add(12.33);  //7
            ar.add('M');	//8
            System.out.println(ar.size());
            System.out.println(ar.get(4));
            System.out.println(ar.get(8));
            System.out.println("CHECK FROM HERE");
            //to print all the values of an arrayList use the for loop
            for( int i=0; i<=(ar.size()-1); i++) {
                System.out.println(ar.get(i));
            }

            //To add only integer values to your arrayList, you need to add <Integer> on both left and right as below
            ArrayList<Integer> ar1 = new ArrayList<Integer>();
            ar1.add(100);
            // ar1.add("Tom");  //This will throw an error if u try to add string value
            System.out.println(ar1.get(0));

            //To add only String values to your arrayList, you need to add <String> on both left and right as below
            ArrayList<String> ar2= new ArrayList<String>();
            ar2.add("Subash ");
            System.out.println(ar2.get(0));
        }

    }

