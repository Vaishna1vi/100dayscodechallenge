/*   Given a square matrix, calculate the absolute difference between the sums of its diagonals.

For example, the square matrix arr is shown below:

1 2 3
4 5 6
9 8 9  
The left-to-right diagonal 1+5+9 = 15. The right to left diagonal 3+5+9 = 17. Their absolute difference is |15-17| = 2.

Function description :-

diagonalDifference takes the following parameter:

int arr[n][m]: an array of integers

Return :-

int: the absolute diagonal difference

Input Format :-

The first line contains a single integer, n, the number of rows and columns in the square matrix arr.
Each of the next n lines describes a row, arr[i], and consists of n space-separated integers arr[i][j].

Constraints :-

-100<= arr[i][j] <=100

Output Format :-

Return the absolute difference between the sums of the matrix's two diagonals as a single integer.

Sample Input :-

3
11 2 4
4 5 6
10 8 -12

Sample Output :-

15

Explanation :-

The primary diagonal is:

11
   5
     -12
Sum across the primary diagonal: 11 + 5 - 12 = 4

The secondary diagonal is:

     4
   5
10
Sum across the secondary diagonal: 4 + 5 + 10 = 19
Difference: |4 - 19| = 15                                   */





import java.util.Scanner;

public class DiagonalDifferernce {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in); 
        int n ;
        int diag1 = 0 ; int diag2 = 0;
        n = Integer.parseInt(in.nextLine());
        for(int i =0 ; i < n; i++){
            String str[] = in.nextLine().split(" ");
            diag1 = diag1 + Integer.parseInt(str[i]);
            diag2 = diag2 + Integer.parseInt(str[n-1-i]);
        }
        
        int diagDiff = Math.abs(diag1 -  diag2);        
        System.out.println(diagDiff);
    }    
}
