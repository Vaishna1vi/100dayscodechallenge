/*       For each array, perform a number of right circular rotations and return the values of the elements at the given indices.

Function Description :-

Complete the circularArrayRotation function.

circularArrayRotation has the following parameter(s):

int a[n]: the array to rotate
int k: the rotation count
int queries[1]: the indices to report

Returns :-

int[q]: the values in the rotated a as requested in m

Input Format :-

The first line contains 3 space-separated integers, n, k, and q, the number of elements in the integer array, the rotation count and the number of queries.
The second line contains n space-separated integers, where each integer i describes array element a[i] (where 0<= i <n).
Each of the q subsequent lines contains a single integer, queries[i], an index of an element in a to return.

Sample Input 0 :-

3 2 3
1 2 3
0
1
2

Sample Output 0 :-

2
3
1                                          */








import java.util.LinkedList;
import java.util.Scanner;

public class Solution
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int q = in.nextInt();
        LinkedList<Integer> list = new LinkedList<Integer>();
        int index;
        
        for(int i = 0; i < n; i++)
        {
            list.add(in.nextInt()); 
        }
        
        while(k > 0)
        {
            int j = list.removeLast();
            list.push(j);
            k--;
        }
        
        while(q > 0)
        {
            index = in.nextInt();
            System.out.println(list.get(index));
            q--;
        }
        in.close();
    }

    
}
