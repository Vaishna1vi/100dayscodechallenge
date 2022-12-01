/*     Exception handling is the process of responding to the occurrence, during computation, of exceptions – anomalous or exceptional conditions requiring special processing – often changing the normal flow of program execution. 

Java has built-in mechanism to handle exceptions. Using the try statement we can test a block of code for errors. The catch block contains the code that says what to do if exception occurs.

In this given problem, we have given two integers x and y as input, we have to compute x/y. If x and y are not 32 bit signed integers or if y is zero, exception will occur and we have to report it. 

Sample Input 0:

10
3

Sample Output 0:

3

Sample Input 1:

10
Hello

Sample Output 1:

java.util.InputMismatchException

Sample Input 2:

10
0

Sample Output 2:

java.lang.ArithmeticException: / by zero

Sample Input 3:

23.323
0

Sample Output 3:

java.util.InputMismatchException                      */



import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
      
        try{
            Scanner sc = new Scanner(System.in);
            int x = sc.nextInt();
            int y = sc.nextInt();
            int div = x/y;
             System.out.println(x/y);
        }
        
        catch(InputMismatchException e) {
            System.out.println("java.util.InputMismatchException");
        }
         catch(Exception e) {
           System.out.println("java.lang.ArithmeticException: / by zero");
         }
    }
}
