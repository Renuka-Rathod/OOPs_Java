Java Exceptions
When executing Java code, different errors can occur: coding errors made by the programmer, errors due to wrong input, or other unforeseeable things.

When an error occurs, Java will normally stop and generate an error message. The technical term for this is: Java will throw an exception (throw an error).


Exception Handling in Java is one of the effective means to handle runtime errors so that the regular flow of the application can be preserved. Java Exception Handling is a mechanism to handle runtime errors such as ClassNotFoundException, IOException, SQLException, RemoteException, etc.



Major reasons why an exception Occurs

Invalid user input
Device failure
Loss of network connection
Physical limitations (out-of-disk memory)
Code errors
Opening an unavailable file

Errors represent irrecoverable conditions such as Java virtual machine (JVM) running out of memory, memory leaks, stack overflow errors, library incompatibility, infinite recursion, etc. Errors are usually beyond the control of the programmer, and we should not try to handle errors.

Exception: Exception indicates conditions that a reasonable application might try to catch.


Exception Hierarchy
All exception and error types are subclasses of the class Throwable, which is the base class of the hierarchy. One branch is headed by Exception. This class is used for exceptional conditions that user programs should catch. NullPointerException is an example of such an exception. Another branch, Error is used by the Java run-time system(JVM) to indicate errors having to do with the run-time environment itself(JRE). StackOverflowError is an example of such an error.


Exceptions can be categorized in two ways:

Built-in Exceptions
Checked Exception
Unchecked Exception 
User-Defined Exceptions
Let us discuss the above-defined listed exception that is as follows:

1. Built-in Exceptions
Built-in exceptions are the exceptions that are available in Java libraries. These exceptions are suitable to explain certain error situations.

Checked Exceptions: Checked exceptions are called compile-time exceptions because these exceptions are checked at compile-time by the compiler.
 
Unchecked Exceptions: The unchecked exceptions are just opposite to the checked exceptions. The compiler will not check these exceptions at compile time. In simple words, if a program throws an unchecked exception, and even if we didn’t handle or declare it, the program would not give a compilation error.
Note: For checked vs unchecked exception, see Checked vs Unchecked Exceptions 

2. User-Defined Exceptions:
Sometimes, the built-in exceptions in Java are not able to describe a certain situation. In such cases, users can also create exceptions, which are called ‘user-defined Exceptions’. 

The advantages of Exception Handling in Java are as follows:

Provision to Complete Program Execution
Easy Identification of Program Code and Error-Handling Code
Propagation of Errors
Meaningful Error Reporting
Identifying Error Types




