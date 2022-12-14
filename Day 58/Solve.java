/*   Complete the function solveMeFirst to compute the sum of two integers.

Example :-

a = 7, b = 3

Return 10.

Function Description :-

solveMeFirst has the following parameters:

int a: the first value
int b: the second value

Returns
- int: the sum of a and b

Constraints :-

1<= a,b <=1000

Sample Input :-

a = 2
b = 3

Sample Output :-

5

Explanation :-

2 + 3 = 5                    */



import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {



    static int solveMeFirst(int a, int b) {
      return a+b;
      
	}

 public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a;
        a = in.nextInt();
        int b;
        b = in.nextInt();
        int sum;
        sum = solveMeFirst(a, b);
        System.out.println(sum);
	}
}
