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
