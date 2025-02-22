package ClassesObjects;

public class TestAccount {
//Creating a test class to deposit and withdraw amount

    public static void main(String[] args){
        Account a1=new Account(832345,"Ankit",1000);
        //a1.insert(832345,"Ankit",1000);

        a1.display();
        a1.checkBalance();
        a1.deposit(40000);
        a1.withdraw(15000);

    }}