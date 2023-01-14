/*      When a contiguous block of text is selected in a PDF viewer, the selection is highlighted with a blue rectangle.
        In this PDF viewer, each word is highlighted independently.
        
Function Description :-

Complete the designerPdfViewer function.

designerPdfViewer has the following parameter(s):

int h[26]: the heights of each letter
string word: a string

Returns :-

int: the size of the highlighted area

Input Format :-

The first line contains 26 space-separated integers describing the respective heights of each consecutive lowercase English letter, ascii[a-z].
The second line contains a single word consisting of lowercase English alphabetic letters.

Constraints :-

1<=h[?]<=7, where ? is an English lowercase letter.
 contains no more than 10 letters.
 
Sample Input 0 :-

1 3 1 3 1 4 1 3 2 5 5 5 5 5 5 5 5 5 5 5 5 5 5 5 5 5
abc

Sample Output 0 :-

9

Sample Input 1 :-

1 3 1 3 1 4 1 3 2 5 5 5 5 5 5 5 5 5 5 5 5 5 5 5 5 7
zaba

Sample Output 1 :-

28                               */






import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int[] c = new int[26];
    for (int i = 0; i < 26; ++i) {
      c[i] = in.nextInt();
    }
    String w = in.next();
    int maxH = 0;
    for (char letter : w.toCharArray()) {
      if (c[letter - 'a'] > maxH) maxH = c[letter - 'a'];
    }
    System.out.println(maxH*w.length());
  }



}
