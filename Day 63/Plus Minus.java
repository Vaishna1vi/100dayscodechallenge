/*     Given an array of integers, calculate the ratios of its elements that are positive, negative, and zero.
       Print the decimal value of each fraction on a new line with 6 places after the decimal.

Note: This challenge introduces precision problems. The test cases are scaled to six decimal places, though answers with absolute error of up to 10^-4 are acceptable.

Function Description :-

Complete the plusMinus function.

plusMinus has the following parameter(s):

int arr[n]: an array of integers

Print :-

Print the ratios of positive, negative and zero values in the array. Each value should be printed on a separate line with 6 digits after the decimal. The function should not return a value.

Input Format :-

The first line contains an integer, n, the size of the array.
The second line contains n space-separated integers that describe arr[n].

Output Format :-

Print the following 3 lines, each to 6 decimals:

proportion of positive values
proportion of negative values
proportion of zeros

Sample Input :-

STDIN           Function
-----           --------
6               arr[] size n = 6
-4 3 -9 0 4 1   arr = [-4, 3, -9, 0, 4, 1]

Sample Output :-

0.500000
0.333333
0.166667                  */




import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {
  public static int n;
    // Complete the plusMinus function below.
    static void plusMinus(int[] arr) {
        int c_neg=0;
        int c_pos=0;
        int c_zero=0;
     for(int i = 0 ; i<n ; i++)
     {
          if(arr[i]<0)
          {
            c_neg+=1;
          }
          if(arr[i]>0)
          {
            c_pos+=1;
          }
          if(arr[i]==0)
          {
            c_zero+=1;
          }

     }
      double pof_pos,pof_neg,pof_zero;
          pof_pos = (double)c_pos/(double)n;
           pof_neg = (double)c_neg/(double)n;
            pof_zero = (double)c_zero/(double)n;
            System.out.println(pof_pos);
             System.out.println(pof_neg);
              System.out.println(pof_zero);


    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
         n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        plusMinus(arr);

        scanner.close();
    }
}
