/*  In the given problem we are using loop statement (for loop) to print the table by taking input from the user

Input Format:
               A single integer, N       Range (2<=N<=20)
Output Format:
                Print 10 lines of output.
                Each line i (where 1<=i<=10) contains the result of N x i in the form: N x i = result.
Sample Input : 5
Sample output : 

                5 x 1 = 5
                5 x 2 = 10
                5 x 3 = 15
                5 x 4 = 20
                5 x 5 = 25
                5 x 6 = 30
                5 x 7 = 35
                5 x 8 = 40
                5 x 9 = 45
                5 x 10 = 50        */
                
   import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        int N = a.nextInt();
        for(int i=1; i<=10;i++) {
            System.out.println(N +" x "+ i +" = "+ N*i);
        }
        
    }
}
