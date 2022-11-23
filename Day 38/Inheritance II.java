/*  We have to write the following code in this problem :

A class named Arithmetic with a method named add that takes 2 integers as parameters and returns an integer denoting their sum.
A class named Adder that inherits from a superclass named Arithmetic.
Our classes should not be be public.

Input Format :-

We are not responsible for reading any input from stdin; a locked code stub will test our submission by calling the add method on an Adder object and passing it 2 integer parameters.

Output Format :-

We are not responsible for printing anything to stdout. Our add method must return the sum of its parameters.

Sample Output :-

The main method in the Solution class above should print the following:

My superclass is: Arithmetic
42 13 20                            */




import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

class Arithmetic {
   public int add(int a, int b) {
        int sum= a + b;
        return sum;
    }
}
class Adder extends Arithmetic {
    public int calladd(int a, int b) {
        return calladd(a, b);
    }
}

public class Solution{
    public static void main(String []args){
        // Create a new Adder object
        Adder a = new Adder();
        
        // Print the name of the superclass on a new line
        System.out.println("My superclass is: " + a.getClass().getSuperclass().getName());	
        
        // Print the result of 3 calls to Adder's `add(int,int)` method as 3 space-separated integers:
        System.out.print(a.add(10,32) + " " + a.add(10,3) + " " + a.add(10,10) + "\n");
     }
}
