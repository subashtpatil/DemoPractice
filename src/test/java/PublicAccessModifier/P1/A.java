package PublicAccessModifier.P1;


/*The public access modifier is specified using the keyword public.

The public access modifier has the widest scope among all other access modifiers.
        Classes, methods, or data members that are declared as public are accessible from
everywhere in the program. There is no restriction on the scope of public data members.
Example 1: Here, the code shows that a public method is accessible within the same package.*/


public class A {

    public void display() {
        System.out.println("GeeksforGeeks");
    }
}