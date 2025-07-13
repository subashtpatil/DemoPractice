package PassByValueByReference;

public class PassByValue {


        public static void modifyPrimitive(int num) {
            num = num + 10; // Changes the local copy of 'num'
            System.out.println("updated value within the method : "+ num);
        }

        public static void main(String[] args) {
            int originalNum = 5;
            System.out.println(originalNum);
            modifyPrimitive(originalNum);
            System.out.println(originalNum); // Output: 5 (originalNum remains unchanged)
        }
    }

