


public class SwappingTwoValues {

 /*   Swapping two
    numbers using
    third variable
    be like this,*/

    public static void main(String[] args) {


        int temp;
        int a = 10;
        int b = 20;
        temp = a;
        a = b;
        b = temp;

        System.out.println("Value of a  "+ a);

        System.out.println("Value of b  "+ b);

      /*  Swapping two
        numbers without
        using third
        variable*/

        int aa = 10;
        int bb = 20;
        aa = aa + bb;
        bb = aa - bb;
        aa = aa - bb;

        System.out.println("Value of aa  "+ aa);

        System.out.println("Value of bb  "+ bb);
    }
}