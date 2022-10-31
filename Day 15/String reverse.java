/*       A palindrome is a word, phrase, number, or other sequence of characters which reads the same backward or forward.

In the given problem, given a string A, print Yes if it is a palindrome, print No otherwise.

Constraints :-
                   A will consist at most 50 lower case english letters.
                   
Sample Input 1 :-
                   madam
                   
Sample Output 1 :-
                   Yes
                   
Sample Input 2 :-
                   mango 
                   
Sample Output 2 :-
                   No                             */
                   
                   
                   
                   
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
       
         if(A.equalsIgnoreCase(new StringBuffer(A).reverse().toString()))
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}
