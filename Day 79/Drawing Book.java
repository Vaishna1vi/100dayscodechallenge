/*     In the given problem, If the book is n pages long, and a student wants to turn to page p, what is the minimum number of pages to turn?
       They can start at the beginning or the end of the book.

Function Description :-

Complete the pageCount function.

pageCount has the following parameter(s):

int n: the number of pages in the book
int p: the page number to turn to

Returns :-

int: the minimum number of pages to turn

Input Format :-

The first line contains an integer n, the number of pages in the book.
The second line contains an integer, p, the page to turn to.

Constraints :-

1<= n <=10^5
1<= p <=n

Sample Input 0 :-

6
2

Sample Output 0 :-

1

Sample Input 1 :-

5
4

Sample Output 1 :-

0                                            */





import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int p = s.nextInt();
        int frontlist = p / 2;
        int backlist = n % 2 == 0 ? (n - p + 1) / 2 : (n - p) / 2;
        System.out.println(Math.min(frontlist, backlist));
    }
}
