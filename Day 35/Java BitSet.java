 /*        Given 2 BitSets, B1 and B2, of size N where all bits in both BitSets are initialized to 0, perform a series of M operations.
           After each operation, print the number of set bits in the respective BitSets as two space-separated integers on a new line.

Input Format :-

The first line contains 2 space-separated integers, N (the length of both BitSets B1 and B2) and M (the number of operations to perform), respectively.
The M subsequent lines each contain an operation in one of the following forms:

AND <set> <set>
OR <set> <set>
XOR <set> <set>
FLIP <set> <index>
SET <set> <index>

In the list above, <set> is the integer 1 or 2, where 1 denotes B1 and 2 denotes B2.
<index> is an integer denoting a bit's index in the BitSet corresponding to <set>.

For the binary operations AND, OR, and XOR, operands are read from left to right and the BitSet resulting from the operation replaces the contents of the first operand.

For example:  AND 2 1
B2 is the left operand, and B1 is the right operand. This operation should assign the result of B1^B2 to B2.

Constraints :-

1<= N <=1000
1<= M <=10000

Output Format :-

After each operation, print the respective number of set bits in BitSet B1 and BitSet B2 as 2 space-separated integers on a new line.

Sample Input :-

5 4
AND 1 2
SET 1 4
FLIP 2 2
OR 2 1

Sample Output :-

0 0
1 0
1 1
1 2                              */




import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
         Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();
    int m = scan.nextInt();

    BitSet b1 = new BitSet(n);
    BitSet b2 = new BitSet(n);

    for (int i = 0; i < m; i++) {
      String opcode = scan.next();
      int num1 = scan.nextInt();
      int num2 = scan.nextInt();

      switch(opcode) {
        case "AND":
          if (num1 == 1 && num2 == 2) {
            b1.and(b2);
          } else if (num1 == 2 && num2 == 1) {
            b2.and(b1);
          } else if (num1 == 1 && num2 == 1) {
            b1.and(b1);
          } else if (num1 == 2 && num2 == 2) {
            b2.and(b2);
          }
          break;
        case "OR":
          if (num1 == 1 && num2 == 2) {
            b1.or(b2);
          } else if (num1 == 2 && num2 == 1) {
            b2.or(b1);
          } else if (num1 == 1 && num2 == 1) {
            b1.or(b1);
          } else if (num1 == 2 && num2 == 2) {
            b2.or(b2);
          }
          break;
        case "XOR":
          if (num1 == 1 && num2 == 2) {
            b1.xor(b2);
          } else if (num1 == 2 && num2 == 1) {
            b2.xor(b1);
          } else if (num1 == 1 && num2 == 1) {
            b1.xor(b1);
          } else if (num1 == 2 && num2 == 2) {
            b2.xor(b2);
          }
          break;
        case "FLIP":
          if (num1 == 1) {
            b1.flip(num2);
          } else if (num1 == 2) {
            b2.flip(num2);
          }
          break;
        case "SET":
          if (num1 == 1) {
            b1.set(num2);
          } else if (num1 == 2) {
            b2.set(num2);
          }
          break;
      }
      System.out.println(b1.cardinality() + " " + b2.cardinality());
    }
    }
}
