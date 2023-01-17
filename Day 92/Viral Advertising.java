/*    In the given problem, Determine how many people have liked the ad by the end of a given day, beginning with launch day as day 1.

Function Description :-

Complete the viralAdvertising function.

viralAdvertising has the following parameter(s):

int n: the day number to report

Returns :-

int: the cumulative likes at that day

Input Format :-

A single integer, n, the day number.

Constraints :-

1<= n <=50

Sample Input :-

3

Sample Output :-

9                                        */







import java.io.*;
import java.util.*;

public class Solution {

    public static final int INITIAL_AMOUNT_OF_PEOPLE = 5;

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int n = scanner.nextInt();
            int currentAmount = INITIAL_AMOUNT_OF_PEOPLE;
            int totalNumber = 0;
            for (int i = 0; i < n; i++) {
                currentAmount = currentAmount/2;
                totalNumber += currentAmount;
                currentAmount *= 3;
            }
            System.out.println(totalNumber);
        }
    }
}
