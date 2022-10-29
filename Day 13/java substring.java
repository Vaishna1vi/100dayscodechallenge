/*   Given a string, s, and two indices, start and end, print a substring consisting of all characters in the inclusive range from start to end-1. 

Input Format :-

The first line contains a single string denoting s.
The second line contains two space-separated integers denoting the respective values of start and end.

Constraints :-

1<=|s|<=100
0<=start<end<=n
String s consists of English alphabetic letters (i.e., [a-z A-Z]) only.

Output Format :-

Print the substring in the inclusive range from start to end-1.

Sample Input :-
                         Helloworld
                         3 7

Sample Output :-         lowo                                                 */




import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String S = in.next();
        int start = in.nextInt();
        int end = in.nextInt();
        
         char[] ch = new char[S.length()];
  
        for (int i = 0; i < S.length(); i++) {
            ch[i] = S.charAt(i);
        }
        for(int i=start;i<end;i++){
            System.out.print(ch[i]);
    }
}
}
