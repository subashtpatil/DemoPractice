package ArrayLists;


/*Since all arrays hold only respective data types, we need to create an array
which can hold all types of data in a single array.*/
public class ObjectArray {

    public static void main(String[] args) {
        Object ar[]= new Object[5];
        ar[0]="Hello";
        ar[1]= 10293;
        ar[2]= "333";
        ar[3]= true;
        ar[4]= 33.333;



        System.out.println(ar.toString());
        System.out.println(String.valueOf(ar));
        System.out.println(ar[0]);
    }

}
