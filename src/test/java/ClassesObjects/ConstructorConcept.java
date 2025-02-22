package ClassesObjects;

/*
Constructor means it is a class entity which is used to define some class features while creating the object.  		https://www.youtube.com/watch?v=XtrSoiFfTEQ
Constructor is used to create an object.
It is similar to a function but not a function.
It cannot return any value.
Constructor name should be same as the class name.
Constructor has no static or any return type, no datatype or anything in the signature just the name (which is same as the class name).
Default constructor is a constructor without any parameters.
Constructor can be overloaded (same name with different datatypes, parameters, and order)
No it is not possible to OVERRIDE a constructor.
*/


public class ConstructorConcept {
int i, j;

    //default constructor without parameters
   public ConstructorConcept(){
       System.out.println("Default constructor without any parameters");
    }

    // constructor with single parameter
    public ConstructorConcept(int i){
        System.out.println("Constructor with single parameter  :  " + i);
    }
//THIS is also known as Constructor Overloading.

    // constructor with two parameter
    public ConstructorConcept(int i, int j){
        System.out.println("Constructor with two parameters-----:   "+ i  +"      "+ j);
    }

    public static void main(String[] args) {
       /* How to call a constructor?
                Constructor will be called immediately when an object of the class is created.
        An object of the class is created in the main method using the new keyword*/

        ConstructorConcept cc= new ConstructorConcept();
        ConstructorConcept cc1= new ConstructorConcept(10);
        ConstructorConcept cc2= new ConstructorConcept(10, 20);


    }

}
