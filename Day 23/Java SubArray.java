/*    Given an array of n integers, find and print its number of negative subarrays on a new line.

Input Format :-

The first line contains a single integer, n, denoting the length of array A=[a0,a1,.....,an-1].
The second line contains n space-separated integers describing each respective element, ai, in array A.

Constraints :-

1<=n<=100
-10^4<=ai<=10^4

Output Format :-

Print the number of subarrays of A having negative sums.

Sample Input :-

5
1 -2 4 -5 1

Sample Output :-

9                                                                     */



import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
       int n,sum=0,c=0;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int[] a = new int[n];
        for(int i=0;i<n;i++){
            a[i] = sc.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            for(int j=i;j<n;j++)
            {
                sum = 0;
                for(int k=i;k<=j;k++)
                {
                    sum+=a[k];
                   
                }
                 if(sum<0)c++;
            }
        }
        System.out.print(c);
    }
}
