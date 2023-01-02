/*      Two friends Anna and Brian, are deciding how to split the bill at a dinner. Each will only pay for the items they consume.
        Brian gets the check and calculates Anna's portion. You must determine if his calculation is correct.

Function Description :-

Complete the bonAppetit function. It should print Bon Appetit if the bill is fairly split.
Otherwise, it should print the integer amount of money that Brian owes Anna.

bonAppetit has the following parameter(s):

bill: an array of integers representing the cost of each item ordered
k: an integer representing the zero-based index of the item Anna doesn't eat
b: the amount of money that Anna contributed to the bill

Input Format :-

The first line contains two space-separated integers n and k, the number of items ordered and the 0-based index of the item that Anna did not eat.
The second line contains n space-separated integers bill[i] where 0 <= i < n.
The third line contains an integer, b, the amount of money that Brian charged Anna for her share of the bill.

Output Format :-

If Brian did not overcharge Anna, print Bon Appetit on a new line; otherwise, print the difference (i.e., b_charged - b_actual) that Brian must refund to Anna.
This will always be an integer.

Sample Input 0 :-

4 1
3 10 2 9
12

Sample Output 0 :-

5

Sample Input 1

4 1
3 10 2 9
7
Sample Output 1

Bon Appetit             */






import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int sum = 0;
        for(int i = 0; i < n; i++){
            if(i != k){
                sum += in.nextInt();
            }else{
                in.nextInt();
            }
        }
        int res = in.nextInt();
        int t = res - sum / 2;
        System.out.println(t == 0 ? ("Bon Appetit") : t);
    }
}
