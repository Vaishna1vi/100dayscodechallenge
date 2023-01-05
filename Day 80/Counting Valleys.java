/*     Given the sequence of up and down steps during a hike, find and print the number of valleys walked through.

Example :-

 Steps = 8      path = [DDUUUUDD]

The hiker first enters a valley 2 units deep. Then they climb out and up onto a mountain 2 units high. Finally, the hiker returns to sea level and ends the hike.

Function Description :-

Complete the countingValleys function.

countingValleys has the following parameter(s):

int steps: the number of steps on the hike
string path: a string describing the path

Returns :-

int: the number of valleys traversed

Input Format :-

The first line contains an integer steps, the number of steps in the hike.
The second line contains a single string path, of steps characters that describe the path.

Sample Input :-

8
UDDDUDUU

Sample Output :-

1                              */




import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        in.nextInt();
        String s = in.next();
        
        int level = 0;
        int valleys = 0;
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == 'U'){
                level++;
            }else if(s.charAt(i) == 'D'){
                if(level == 0){
                    valleys++;
                }
                level--;
            }
        }
        System.out.println(valleys);
    }
}
