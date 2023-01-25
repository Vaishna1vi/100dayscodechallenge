/*       Given an integer, k, and two strings, s and t, determine whether or not we can convert s to t by performing exactly k of the above operations on s.
         If it's possible, print Yes. Otherwise, print No.
         
         Function Description :-

Complete the appendAndDelete function. It should return a string, either Yes or No.

appendAndDelete has the following parameter(s):

string s: the initial string
string t: the desired string
int k: the exact number of operations that must be performed

Returns :-

string: either Yes or No

Input Format :-

The first line contains a string s, the initial string.
The second line contains a string t, the desired final string.
The third line contains an integer k, the number of operations.

Constraints :-

1<= |s| <=100
1<= |t| <=100
1<= k <=100

s and t consist of lowercase English letters, ascii[a-z].
 
Sample Input 0 :-

hackerhappy
hackerrank
9

Sample Output 0 :-

Yes

Sample Input 1 :-

aba
aba
7

Sample Output 1 :-

Yes

Sample Input 2 :-

ashley
ash
2

Sample Output 2 :-

No                                          */





import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String t = in.next();
        int k = in.nextInt();
        int toDelete = 0;
        int i = 0;
        while (i < s.length() && i < t.length() && s.charAt(i) == t.charAt(i)) {
            i++;
        }
        toDelete = s.length() - i;
        int ops = toDelete + (t.length() - i);
        if (ops <= k && ((k - ops) % 2 == 0 || (k - ops) > 2 * i)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
