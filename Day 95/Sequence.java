/*     Given a sequence of n integers, p(1), p(2),....., p(n) where each element is distinct and satisfies 1<= p(x) <=n.
       For each x where 1<= x <= n, that is x increments from 1 to n, find any integer y such that p(p(y))=x and keep a history of the values of y in a return array.
       
       Function Description :-

Complete the permutationEquation function.

permutationEquation has the following parameter(s):

int p[n]: an array of integers

Returns :-

int[n]: the values of y for all x in the arithmetic sequence 1 to n.

Input Format :-

The first line contains an integer n, the number of elements in the sequence.
The second line contains n space-separated integers p[i] where 1<= i <=n.

Constraints :-

1<= n <=50
1<= p[i] <= 50, where 1<= i <=n.
Each element in the sequence is distinct.

Sample Input 0 :-

3
2 3 1

Sample Output 0 :-

2
3
1

Sample Input 1 :-

5
4 3 5 1 2

Sample Output 1 :-

1
3
5
4
2                                          */







import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    public static void main(String args[] ) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[]=new int[n];
        for(int i = 0 ;i<n;i++)
            arr[i]=sc.nextInt();
        for(int i = 0 ;i<n;i++)
            {
            int pos = 0;
            for(int j = 0 ; j<n;j++)
                {
                if(arr[j]==i+1)
                {
                pos = j+1 ;
                    break;
                }
              }
            int pos1=0;
            for(int j = 0 ; j<n;j++)
                {
                if(arr[j]==pos)
                {
                pos1 = j ;break;
            }
            }
            System.out.println(pos1+1);
        }
    }
}
