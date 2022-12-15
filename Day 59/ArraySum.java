/*      Given an array of integers, find the sum of its elements.

For example, if the array ar = [1, 2, 3], 1 + 2 + 3 = 6, so return 6.

Function Description :-

Complete the simpleArraySum function. It must return the sum of the array elements as an integer.

simpleArraySum has the following parameter(s):

ar: an array of integers

Input Format :- 

The first line contains an integer, n, denoting the size of the array.
The second line contains n space-separated integers representing the array’s elements.

Constraints :-

0 < n, arr[i] <= 1000

Output Format :-

Print the sum of the array’s elements as a single integer.

Sample Input :-

6
1 2 3 4 10 11

Sample Output :-

31

Explanation :-

We print the sum of the array’s elements: 1 + 2 + 3 + 4 + 10 + 11 = 31.       */



import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class Solution {

    static int simpleArraySum(int[] ar) {
        
          int sum = 0;
        for(int i=0;i<ar.length;i++){
        sum+=ar[i];
        }
        return sum;

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int arCount = Integer.parseInt(scanner.nextLine().trim());

        int[] ar = new int[arCount];

        String[] arItems = scanner.nextLine().split(" ");

        for (int arItr = 0; arItr < arCount; arItr++) {
            int arItem = Integer.parseInt(arItems[arItr].trim());
            ar[arItr] = arItem;
        }

        int result = simpleArraySum(ar);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();
    }
}
