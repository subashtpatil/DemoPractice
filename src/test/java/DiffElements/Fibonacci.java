package DiffElements;

import java.util.Scanner;

/*Each number (every third number) is equal to the sum of the preceding two numbers.
For example, 0, 1, 1, 2, 3, 5, 8, 13, 21*/
public class Fibonacci {

        public static void main(String[] args)
        {
            int n, a = 0, b = 0, c = 1;
            Scanner s = new Scanner(System.in);
            System.out.print("Enter value of n:");
            n = s.nextInt();
            System.out.print("Fibonacci Series:");
            for(int i = 1; i <= n; i++)
            {
                a = b;
                b = c;
                c = a + b;
                System.out.print(a+", ");
            }
        }
    }
/*The number is said to be in a Fibonacci series if each subsequent
number is the sum of the previous two numbers.*/

