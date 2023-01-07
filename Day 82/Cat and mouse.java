/*      Two cats and a mouse are at various positions on a line. You will be given their starting positions.
        Your task is to determine which cat will reach the mouse first, assuming the mouse does not move and the cats travel at equal speed.
        If the cats arrive at the same time, the mouse will be allowed to move and it will escape while they fight.

You are given q queries in the form of x, y, and z representing the respective positions for cats A and B, and for mouse C.
Complete the function catAndMouse to return the appropriate answer to each query, which will be printed on a new line.

If cat A catches the mouse first, print Cat A.
If cat B catches the mouse first, print Cat B.
If both cats reach the mouse at the same time, print Mouse C as the two cats fight and mouse escapes.

Function Description :-

Complete the catAndMouse function.

catAndMouse has the following parameter(s):

int x: Cat A's position
int y: Cat B's position
int z: Mouse C's position

Returns :-

string: Either 'Cat A', 'Cat B', or 'Mouse C'

Input Format :-

The first line contains a single integer, q, denoting the number of queries.
Each of the q subsequent lines contains three space-separated integers describing the respective values of x(cat A's location), y(cat B's location), and z(mouse C's location).

Constraints :-

1<= q <=100
1<= x,y,z <=100

Sample Input 0 :-

2
1 2 3
1 3 2

Sample Output 0 :-

Cat B
Mouse C                  */






import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        for(int a0 = 0; a0 < q; a0++){
            int x = in.nextInt();
            int y = in.nextInt();
            int z = in.nextInt();
            
            int dist = Math.abs(x-z);
            int dist2 = Math.abs(y-z);
            if (dist < dist2) System.out.println("Cat A");
            else if (dist > dist2) System.out.println("Cat B");
            else System.out.println("Mouse C");
        }
    }
}
