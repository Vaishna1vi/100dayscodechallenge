/*    Staircase detail :-

This is a staircase of size n=4 :

   #
  ##
 ###
####
Its base and height are both equal to n. It is drawn using # symbols and spaces. The last line is not preceded by any spaces.

Write a program that prints a staircase of size n.

Function Description :-

Complete the staircase function.

staircase has the following parameter(s):

int n: an integer

Print :-

Print a staircase as described above.

Input Format :-

A single integer, n, denoting the size of the staircase.

Constraints :-

0< n <=100 .

Output Format :-

Print a staircase of size n using # symbols and spaces.

Note: The last line must have 0 spaces in it.

Sample Input :-

6 

Sample Output :-

     #
    ##
   ###
  ####
 #####
######

Explanation :-

The staircase is right-aligned, composed of # symbols and spaces, and has a height and width of n=6.       */





import java.io.*;
import java.util.*;

public class Solution {
    
    public static void drawStair(int size) {
        int level = size-1;
        for(int i = 0; i < size; i++) {
            StringBuilder s = new StringBuilder();
            for(int k = 0; k < level; k++) {
                s.append(" ");
            }
            for(int k = 0; k < size - level; k ++){
                s.append("#");
            }
            level -= 1;
            System.out.println(s.toString());
        }
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        Solution sol = new Solution();
        
        int size = in.nextInt();
        sol.drawStair(size);
    }
}
