package ClassesObjects;
 //A class is a blueprint/template to create an object, eg Students_Class

//An object is an instance of a class, u can create any number of Students (Objects) from Students_Class

public class EmployeeTest {

    public static void main(String args[]) {
        /* Create two objects using constructor */
        Employee empOne = new Employee("Subash Patil");
        Employee empTwo = new Employee("Varun Patil");

        // Invoking methods for each object created
        empOne.empAge(50);
        empOne.empDesignation(" Software Engineer");
        empOne.empSalary(1000);
        empOne.printEmployeeDetails();

        empTwo.empAge(21);
        empTwo.empDesignation("Software Developer");
        empTwo.empSalary(500);
        empTwo.printEmployeeDetails();
    }
}
