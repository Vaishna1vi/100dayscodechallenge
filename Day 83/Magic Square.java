/*    You will be given a 3x3 matrix s of integers in the inclusive range [1,9]. We can convert any digit a to any other digit b in the range [1,9] at cost of |a-b|.
      Given s, convert it into a magic square at minimal cost. Print this cost on a new line.

Note: The resulting magic square must contain distinct integers in the inclusive range [1,9].

Example :-

$s = [[5, 3, 4], [1, 5, 8], [6, 4, 2]]

The matrix looks like this:

5 3 4
1 5 8
6 4 2

We can convert it to the following magic square:

8 3 4
1 5 9
6 7 2

This took three replacements at a cost of |5-8|+|8-9|+|4-7|=7.

Function Description :-

Complete the formingMagicSquare function.

formingMagicSquare has the following parameter(s):

int s[3][3]: a 3x3 array of integers

Returns :-

int: the minimal total cost of converting the input square to a magic square

Input Format :-

Each of the 3 lines contains three space-separated integers of row s[i].

Constraints :-

s[i][j] E [1,9]

Sample Input 0 :-

4 9 2
3 5 7
8 1 5

Sample Output 0 :-

1

Sample Input 1 :-

4 8 2
4 5 7
6 1 6

Sample Output 1 :-

4                                   */





import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int[] square = new int[9];
        for (int i = 0; i < 9; i++) {
            square[i] = scan.nextInt();
        }
        int[][] matrix={{4,9,2,3,5,7,8,1,6},
                        {2,7,6,9,5,1,4,3,8},
                        {6,1,8,7,5,3,2,9,4},
                        {8,3,4,1,5,9,6,7,2},
                        {2,9,4,7,5,3,6,1,8},
                        {6,7,2,1,5,9,8,3,4},
                        {8,1,6,3,5,7,4,9,2},
                        {4,3,8,9,5,1,2,7,6}};
        
        int minOff = 99;
        for (int i = 0; i < 8; i++) {
            int off = 0;
            for (int j = 0; j < 9; j++) {
                if (square[j] != matrix[i][j]) {
                    off += Math.abs(square[j] - matrix[i][j]);
                }
            }
            if (off < minOff) minOff = off;
        }
        
        System.out.println(minOff);
    }
}
