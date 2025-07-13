package Exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/*
An exception (or exceptional event) is a problem that arises during the execution of a program.
When an Exception occurs the normal flow of the program is disrupted and the program/Application
        terminates abnormally, which is not recommended, therefore, these exceptions are to be handled.
An exception can occur for many different reasons. Following are some scenarios where an exception occurs.
        •	A user has entered an invalid data.
•	A file that needs to be opened cannot be found.
        •	A network connection has been lost in the middle of communications or the JVM has run out of memory.
Some of these exceptions are caused by user error, others by programmer error, and others by physical resources
that have failed in some manner.
Based on these, we have three categories of Exceptions. You need to understand them to know how
exception handling works in Java.
•	Checked exceptions − A checked exception is an exception that is checked (notified) by the compiler
at compilation-time, these are also called as compile time exceptions. These exceptions cannot simply be ignored,
the programmer should take care of (handle) these exceptions.
For example, if you use FileReader class in your program to read data from a file, if the file specified in its
constructor doesn't exist, then a FileNotFoundException occurs, and the compiler prompts the programmer to handle
the exception.
*/


public class FilenotFound_Demo {

    public static void main(String args[]) throws IOException {
       // File file = new File("E://file.txt");
        File file = new File("E://ErrorsList.docx");

        FileReader fr = new FileReader(file);
        System.out.println(fr.read());
    }
}
/*
Exception in thread "main" java.io.FileNotFoundException: E:\file.txt (The system cannot find the file specified)

Note − Since the methods read() and close() of FileReader class throws IOException, you can observe that the
compiler notifies to handle IOException, along with FileNotFoundException.*/
