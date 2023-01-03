/*      There is a large pile of socks that must be paired by color.
        Given an array of integers representing the color of each sock, determine how many pairs of socks with matching colors there are.

Function Description :-

Complete the sockMerchant function.

sockMerchant has the following parameter(s):

int n: the number of socks in the pile
int ar[n]: the colors of each sock

Returns :-

int: the number of pairs

Input Format :-

The first line contains an integer n, the number of socks represented in ar.
The second line contains n space-separated integers, ar[i], the colors of the socks in the pile.

Constraints :-

1<= n <=100
1<= ar[i] <=100 where 0<= i <n 

Sample Input :-

STDIN                       Function
-----                       --------
9                           n = 9
10 20 20 10 10 30 50 10 20  ar = [10, 20, 20, 10, 10, 30, 50, 10, 20]

Sample Output :-

3                                         */





import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int pairs = 0;
        Set<Integer> unmatched = new HashSet<>();
        for (int i = 0; i < n; ++i) {
            int ci = in.nextInt();
            if (unmatched.contains(ci)) {
                unmatched.remove(ci);
                ++pairs;
            }
            else {
                unmatched.add(ci);
            }
        }
        System.out.println(pairs);
    }
}
