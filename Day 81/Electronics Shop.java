/*     A person wants to determine the most expensive computer keyboard and USB drive that can be purchased with a give budget.
       Given price lists for keyboards and USB drives and a budget, find the cost to buy them. If it is not possible to buy both items, return .

Function Description :-

Complete the getMoneySpent function.

getMoneySpent has the following parameter(s):

int keyboards[n]: the keyboard prices
int drives[m]: the drive prices
int b: the budget

Returns :-

int: the maximum that can be spent, or -1 if it is not possible to buy both items

Input Format :-

The first line contains three space-separated integers b, n, and m, the budget, the number of keyboard models and the number of USB drive models.
The second line contains n space-separated integers keyboard[i], the prices of each keyboard model.
The third line contains m space-separated integers drives, the prices of the USB drives.

Constraints :-

1<= n,m <= 1000
1<= b <= 10^6
The price of each item is in the inclusive range [1,10^6].

Sample Input 0 :-

10 2 3
3 1
5 2 8

Sample Output 0 :-

9

Sample Input 1 :-

5 1 1
4
5

Sample Output 1 :-

-1                                       */






import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        int n = in.nextInt();
        int m = in.nextInt();
        int[] keyboards = new int[n];
        for(int keyboards_i=0; keyboards_i < n; keyboards_i++){
            keyboards[keyboards_i] = in.nextInt();
        }
        int[] pendrives = new int[m];
        for(int pendrives_i=0; pendrives_i < m; pendrives_i++){
            pendrives[pendrives_i] = in.nextInt();
        }
        int max=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(keyboards[i]+pendrives[j]<=s){
                  if(max<keyboards[i]+pendrives[j]){
                      max=keyboards[i]+pendrives[j];
                  }  
                }
            }
        }
        System.out.println(max==0?-1:max);
        
    }
}
