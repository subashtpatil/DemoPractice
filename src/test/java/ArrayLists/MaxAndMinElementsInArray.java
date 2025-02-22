package ArrayLists;

public class MaxAndMinElementsInArray {
    public static void main(String[] args) {
        int a[] = {50, 30, 40, 20, 60};
       int max = a[0];
        for (int i = 0; i < a.length; i++) {
            if (a[i] > max) {
                max = a[i];
            }
        }
        System.out.println("Maximum value of element in an array = "+max);


        /// Minimum element in an array
        int b[] = {50, 30, 40, 20, 60};
        int min = a[0];

        for (int i = 0; i < a.length; i++) {
            //if (a[i] > max) {
            if (a[i] < min) {
                min = a[i];
            }
        }
        System.out.println("Minimum value of element in an array = "+min);
    }

}
