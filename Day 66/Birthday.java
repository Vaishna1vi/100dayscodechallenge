/*    We are in charge of the cake for a child's birthday. We have decided the cake will have one candle for each year of their total age.
      They will only be able to blow out the tallest of the candles. Count how many candles are tallest.

Example :-

[4,4,1,3]
The maximum height candles are 4 units high. There are 2 of them, so return 2.

Function Description :-

Complete the function birthdayCakeCandles.

birthdayCakeCandles has the following parameter(s):

int candles[n]: the candle heights

Returns :-

int: the number of candles that are tallest

Input Format :-

The first line contains a single integer, n, the size of candles[].
The second line contains n space-separated integers, where each integer i describes the height of candles[i].

Sample Input :-

4
3 2 1 3

Sample Output :-

2                                       */




import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int n = in.nextInt();
        int max = 0;
        int sum = 0;
        int num;
        for(int i =0; i < n; i++){
            num = in.nextInt();
            if(num > max){
                sum = 1;
                max = num;
            }else if(num == max){
                sum++;
            }
        }
        System.out.println(sum);
    }
}
