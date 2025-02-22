package TestSuperKeyword;

import net.bytebuddy.implementation.bind.annotation.Super;

public class B extends A{  //B is child of A and also inherits it

    public B(){
        super(101);     //Calling the parent class constructor with matching arguments.
        System.out.println("Child class constructor");
    }

    public B(int i){
        System.out.println("Child class constructor with value of variable i =   ");

    }

    public static void main(String[] args) {
        B obj = new B();

    }
}
