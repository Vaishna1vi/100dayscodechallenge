/*   Complete the function power in class MyCalculator and return the appropriate result after the power operation.

Input Format :-

Each line of the input contains two integers, n and p. The locked stub code in the editor reads the input and sends the values to the method as parameters.

Constraints :-

-10<= n <=10
-10<= p <=10

Output Format :-

Each line of the output contains the result n^p, if both n and p are positive. If either n or p is negative, the output contains "n and p should be non-negative".
If both n and p are zero, the output contains "n and p should not be zero.". 

Sample Input 0 :-

3 5
2 4
0 0
-1 -2
-1 3

Sample Output 0 :-

243
16
java.lang.Exception: n and p should not be zero.
java.lang.Exception: n or p should not be negative.
java.lang.Exception: n or p should not be negative.                  */



import java.util.Scanner;
class MyCalculator {
    public static long power(int a,int b) throws Exception {
         long la = a;
        long lb = b;
             long c = (long)Math.pow(la,lb);
             if(la==0 && lb==0)  {
                 throw new Exception("n and p should not be zero.");
             }
             else if(la<0 || lb <0) {
             throw new Exception("n or p should not be negative.");
             
             }
             else
             return c;

    }
    
}

public class Solution {
    public static final MyCalculator my_calculator = new MyCalculator();
    public static final Scanner in = new Scanner(System.in);
    
    public static void main(String[] args) {
        while (in .hasNextInt()) {
            int n = in .nextInt();
            int p = in .nextInt();
            
            try {
                System.out.println(my_calculator.power(n, p));
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}
