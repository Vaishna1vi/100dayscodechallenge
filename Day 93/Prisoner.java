/*          Determine the chair number occupied by the prisoner who will receive that candy.

Function Description :-

Complete the saveThePrisoner function. It should return an integer representing the chair number of the prisoner to warn.

saveThePrisoner has the following parameter(s):

int n: the number of prisoners
int m: the number of sweets
int s: the chair number to begin passing out sweets from

Returns :-

int: the chair number of the prisoner to warn

Input Format :-

The first line contains an integer, t, the number of test cases.
The next t lines each contain 3 space-separated integers:

n: the number of prisoners
m: the number of sweets
s: the chair number to start passing out treats at

Constraints :-

1<=t<=100
1<=n<=10^9
1<=m<=10^9
1<=s<=n

Sample Input 0 :-

2
5 2 1
5 2 2

Sample Output 0 :-

2
3

Sample Input 1 :-

2
7 19 2
3 7 3

Sample Output 1 :-

6
3                                                                             */






import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        for(int i=0;i<t;i++)
        {
            int n = scanner.nextInt();
            int m = scanner.nextInt();
            int s = scanner.nextInt();
            int result = (m + s - 1) % n;
            if(result == 0)
                result = n;
            System.out.println(result);
        }
        
    }
}
