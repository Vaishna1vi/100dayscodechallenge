/*   We have to figure out a way to get both kangaroos at the same location at the same time as part of the show. If it is possible, return YES, otherwise return NO.

Function Description :-

Complete the function kangaroo.

kangaroo has the following parameter(s):

int x1, int v1: starting position and jump distance for kangaroo 1
int x2, int v2: starting position and jump distance for kangaroo 2

Returns :-

string: either YES or NO

Input Format :-

A single line of four space-separated integers denoting the respective values of x1, v1, x2, and v2.

Constraints :-

0 <= x1 < x2 <= 10000
1 <= v1 <= 10000
1 <= v2 <= 10000

Sample Input :-

0 3 4 2

Sample Output :-

YES                              */





import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x1 = in.nextInt();
        int v1 = in.nextInt();
        int x2 = in.nextInt();
        int v2 = in.nextInt();
        
        int vdiff = v1 - v2;
        if (vdiff <= 0) {
            System.out.println("NO");
            return;
        }
        int xdiff = x1 - x2;
        System.out.println(xdiff % vdiff == 0 ? "YES" : "NO");
    }
}
