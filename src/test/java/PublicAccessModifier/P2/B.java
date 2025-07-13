package PublicAccessModifier.P2;

// public access modifier
import PublicAccessModifier.P1.A;
//import P1.*;

class B {
    public static void main(String args[]) {

        A obj = new A();
        obj.display();
    }
}

/*
Example 2: Here, the example shows that a public method is accessible across packages.*/
