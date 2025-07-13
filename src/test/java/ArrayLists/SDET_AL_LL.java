package ArrayLists;



import java.util.ArrayList;
import java.util.LinkedList;

public class SDET_AL_LL {
        public static void main(String[] args) {

            ArrayList<String> cases = new ArrayList<>();
            cases.add("Login Test");
            cases.add("Payment Test");

            System.out.println("Cases: " + cases);

            LinkedList<String> testSteps = new LinkedList<>();
            testSteps.add("Setup");
            testSteps.add("Execution");
            testSteps.addFirst("Initialization");

            System.out.println("Steps: " + testSteps);

        }
    }

/*
ArrayList is better for scenarios where random access to elements is needed, as it uses an index-based structure.
LinkedList is more efficient for scenarios involving frequent insertions and deletions, as it uses a node-based structure.
Example —

Use ArrayList to store a list of test cases for sequential execution.
Use LinkedList for dynamic scenarios where test steps might change during runtime.*/
