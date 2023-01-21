/*      Given the values of n, k, and the configuration of the clouds as an array c, determine the final value of e after the game ends.

Function Description :-

Complete the jumpingOnClouds function.

jumpingOnClouds has the following parameter(s):

int c[n]: the cloud types along the path
int k: the length of one jump

Returns :-

int: the energy level remaining.

Input Format :-

The first line contains two space-separated integers, n and k, the number of clouds and the jump distance.
The second line contains n space-separated integers c[i] where 0<= i <n. Each cloud is described as follows:

If c[i]=0, then cloud i is a cumulus cloud.
If c[i]=1, then cloud i is a thunderhead.

Constraints :-

2<= n <=25
1<= k <=n
n%k=0

Sample Input :-

STDIN             Function
-----             --------
8 2               n = 8, k = 2
0 0 1 0 0 1 1 0   c = [0, 0, 1, 0, 0, 1, 1, 0]

Sample Output :-

92                                                   */





import java.util.*;
public class A
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        
        int n = in.nextInt();
        int k = in.nextInt();
        
        int[] array = new int[n];
        for(int x = 0; x < n; x++)
        {
            array[x] = in.nextInt();
        }
        
        int cloud = 0;
        int e = 100;
        for(int y = 0; y < n; y++)
        {
            cloud = (cloud + k) % n;
            e--;
            
            if(array[cloud] == 1)
            {
                e -= 2;
            }
            
            if(cloud == 0)
            {
                break;
            }
        }
        
        System.out.println(e);
    }
}
