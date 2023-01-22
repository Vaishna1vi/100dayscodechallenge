/*       Given an integer, for each digit that makes up the integer determine whether it is a divisor. Count the number of divisors occurring within the integer.

Function Description :-

Complete the findDigits function.

findDigits has the following parameter(s):

int n: the value to analyze

Returns :-

int: the number of digits in n that are divisors of n

Input Format :-

The first line is an integer, t, the number of test cases.
The t subsequent lines each contain an integer, n.

Constraints :-

1<= t <=15
0< n <10^9

Sample Input :-

2
12
1012

Sample Output :-

2
3                                         */






import java.util.*;
class Solution
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int t,ans,d;
        long n,m;
        t=in.nextInt();
        while(t-->0)
        {
            ans=0;
            n=in.nextLong();
            m=n;
            while(m!=0)
            {
                d=(int)m%10;
                m=m/10;
                if(d==0)
                continue;
                if(n%d==0)
                ans++;
            }
            System.out.println(ans);
        }
    }
}
