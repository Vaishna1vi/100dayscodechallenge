/*       Calculate and print the factorial of a given integer.

Function Description :-

Complete the extraLongFactorials function. It should print the result and return.

extraLongFactorials has the following parameter(s):

n: an integer

Input Format :-

Input consists of a single integer n

Constraints :-

1<= n <= 100

Output Format :-

Print the factorial of n.

Sample Input :-

25

Sample Output :-

 15511210043330985984000000                                                                                */






import java.io.*;
import java.util.*;
import java.math.BigInteger;

public class Solution {

    public static void main(String[] args) {
        int N,i;
            Scanner in=new Scanner(System.in);
            N=in.nextInt();
        BigInteger res=BigInteger.ONE;
       for(i=2;i<=N;i++){
       res = res.multiply(BigInteger.valueOf(i));
 
}
        System.out.println(res);
    }
}
