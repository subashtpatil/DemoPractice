package DiffElements;

import java.util.Scanner;

public class ReverseANumber {

        public static void main(String[] args) {

            //METHOD 1::
            Scanner s = new Scanner(System.in);
            System.out.println("Enter the number to be reversed");
            int num = s.nextInt();
            int rev = 0;

            while (num != 0) {
                rev = rev * 10 + num % 10;
                num = num / 10;

            }
            System.out.println("The reversed number by 1st method is  " + rev);

            // METHOD 2:
             s = new Scanner(System.in);
            System.out.println("Enter the number to be reversed");
            int num2 = s.nextInt();

            // Using StringBuffer class
            StringBuffer sb = new StringBuffer(String.valueOf(num2));
           // StringBuffer   pb = sb.reverse();
           // System.out.println("The reversed number by String Buffer is  " + pb);
            System.out.println(sb.reverse());

            //METHOD 3 :
             s = new Scanner(System.in);
            System.out.println("Enter the number to be reversed");
            int num3 = s.nextInt();

            StringBuilder sbl= new StringBuilder(String.valueOf(num3));
           // sbl.append(num3);
            StringBuilder rev3= sbl.reverse();

            System.out.println("The reversed number by String Builder is  " + rev3);
        }
    }