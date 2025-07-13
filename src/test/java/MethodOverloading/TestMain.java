package MethodOverloading;

/*
the Main method can also be overloaded same as normal method overloading techniques.
Method overloading is a sub-process of Polymorphism. To achieve method overloading we have to
declare and define multiple
methods with the same name but having different signatures
like the number of parameters, type of parameters type etc.

        Although, we can overload the main method but, the entry point of a Java program will always be the method
         with default signature as mentioned below:
Public static void main(String args[])
We can call other methods by default main method.
*/


public class TestMain {
    // Default main method which will be entry point of the program.
    public static void main(String[] args)
    {
        System.out.println("The entry point of the Program.");
        main(10);
        main();
    }

    // First instance of the main method.
    public static void main(int x)
    {
        System.out.println("Main method overloading first instance with int as argument.");
    }

    // Second instance of the main method.
    public static void main()
    {
        System.out.println("Main method overloading the second instance without any argument.");
    }

    // Keeping only return type different will not be allowed in overloading in Java.
	/*public static String main(int y)
	{
		System.out.println("Main method overloading second instance.");
		return "Main method overloaded...";
	}*/
}

