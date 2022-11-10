/*     Given a list, L, of N integers, perform Q queries on the list.
       Once all queries are completed, print the modified list as a single line of space-separated integers.

Input Format :-

The first line contains an integer, N (the initial number of elements in L).
The second line contains N space-separated integers describing L.
The third line contains an integer, Q (the number of queries).
The 2Q subsequent lines describe the queries, and each query is described over two lines:

If the first line of a query contains the String Insert, then the second line contains two space separated integers x y, and the value y must be inserted into L at index x.
If the first line of a query contains the String Delete, then the second line contains index x, whose element must be deleted from L.

Constraints :-

1<= N <=4000
1<= Q <=4000
Each element in is a 32-bit integer.

Output Format :-

Print the updated list L as a single line of space-separated integers.

Sample Input :-

5
12 0 1 78 12
2
Insert
5 23
Delete
0

Sample Output :-

0 1 78 12 23                          */




import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
         final Scanner in = new Scanner(System.in);
        final int size = in.nextInt();
        final List<Integer> list = new LinkedList<>();
        for (int i = 0; i < size; i++) {
            list.add(in.nextInt());
        }
        final int commandCount = in.nextInt();
        for (int i = 0; i < commandCount; i++) {
            in.nextLine();
            String command = in.nextLine();
//            System.out.println("command: " + command);
            if (command.equals("Insert")) {
                int index = in.nextInt();
//                System.out.println("index: " + index);
                int value = in.nextInt();
//                System.out.println("value: " + value);
                list.add(index, value);
            } else {
                int index = in.nextInt();
                list.remove(index);
            }
        }
        int count = 0;
        for (Integer number : list) {
            System.out.print(number);
            if (count != list.size() - 1) {
                System.out.print(" ");
            }
            count++;
        }
    }
}
