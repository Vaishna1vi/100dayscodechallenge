/*     Given a large integer,n, use the Java BigInteger class' isProbablePrime method to determine and print whether it's prime or not prime.

Input Format :-

A single line containing an integer, n (the number to be checked).

Constraints :-

n contains at most 100 digits.
 
Output Format :-

If n is a prime number, print prime; otherwise, print not prime.

Sample Input :-

13

Sample Output :-

prime

Explanation :-

The only positive divisors of 13 are 1 and 13, so we print prime.                       */



import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;


public class Solution {
    public static void main(String[] args) throws IOException {
      Scanner in = new Scanner(System.in);
      BigInteger n = in.nextBigInteger();
      in.close();
      System.out.println( n.isProbablePrime(1000) ? "prime" : "not prime" );
   }
}
