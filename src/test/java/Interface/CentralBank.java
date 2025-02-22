package Interface;

//      https://www.geeksforgeeks.org/java-application-to-implement-bank-functionality/

public interface CentralBank{
    long  getBalance();
    void withdraw(long amount);
    void deposit(long amount);
    void showAccount();
    boolean search(String acc_no);
}