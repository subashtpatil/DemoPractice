package ArrayLists;


/*Since all arrays hold only respective data types, we need to create an array
which can hold all types of data in a single array.*/
public class ObjectArray {

    public static void main(String[] args) {
        Object[] arr= new Object[5];
        arr[0]="Hello";
        arr[1]= 10293;
        arr[2]= "333";
        arr[3]= true;
        arr[4]= 33.333;

        System.out.println(arr.toString());
        System.out.println(String.valueOf(arr));
        System.out.println(arr[0]);
    }
}
