package MethodHiding;

public class CodeExecution {

    public static void main(String[] args) {
        Parent p = new Parent();
        Parent c = new Child();

        System.out.println("****************Method Hiding*******************");
        p.first(); // This will call method in parent class
        c.first(); // This will call method in parent class
        System.out.println("****************Method overriding*******************");
        p.bar(); // This will call method in parent class
        c.bar(); // This will call method in child class
    }
}
/*If a subclass has a static method with the same name and signature as a static method in the superclass,
then the method in the super-class will be called irrespective of the fact whether it is called from
        child class or parent class.
In case of method overriding we override method from parent class, i.e.
if a subclass has a non-static method with the same name and signature as a non-static method in the superclass
then respective methods are called depending upon reference used, i.e. if object of parent class
is used to call non-static method in parent class then method from parent class is used and if object of child class
is used to call non-static method in child class then method from child class is used.*/
