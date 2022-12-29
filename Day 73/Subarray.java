/*      Two children, Lily and Ron, want to share a chocolate bar. Each of the squares has an integer on it.

Lily decides to share a contiguous segment of the bar selected such that:

The length of the segment matches Ron's birth month, and,
The sum of the integers on the squares is equal to his birth day.
Determine how many ways she can divide the chocolate.

Function Description :-

Complete the birthday function.

birthday has the following parameter(s):

int s[n]: the numbers on each of the squares of chocolate
int d: Ron's birth day
int m: Ron's birth month

Returns :-

int: the number of ways the bar can be divided

Input Format :-

The first line contains an integer n, the number of squares in the chocolate bar.
The second line contains n space-separated integers s[i], the numbers on the chocolate squares where 0 <= i < n.
The third line contains two space-separated integers, d and m, Ron's birth day and his birth month.

Sample Input 0 :-

5
1 2 1 3 2
3 2

Sample Output 0 :-

2

Sample Input 1 :-

6
1 1 1 1 1 1
3 2

Sample Output 1 :-

0

Sample Input 2 :-

1
4
4 1

Sample Output 2 :-

1                                     */




import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] squares = new int[n];
        for(int squares_i=0; squares_i < n; squares_i++){
            squares[squares_i] = in.nextInt();
        }
        int d = in.nextInt();
        int m = in.nextInt();
        int result = 0;
        
        for(int i = 0; i < n-m+1; i++){
            int tmpSum = 0;
            for(int j = i; j < i+m; j++){
                tmpSum+= squares[j];
            } 
            if(tmpSum == d){
                result++;
            }
        }
        System.out.println(result);
        
    }
}
