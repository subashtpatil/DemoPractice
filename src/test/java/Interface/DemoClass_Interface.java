package Interface;

public class DemoClass_Interface implements FirstInterface, SecondInterface {

    @Override
  public void myMethod() {
        System.out.println("Inside MyMethod");
    }

    @Override
    public void myOtherMethod() {
        System.out.println("Inside MyOtherMethod");
    }

    public static void main(String[] args) {
        DemoClass_Interface myObj = new DemoClass_Interface();
        myObj.myMethod();
        myObj.myOtherMethod();
    }


}
