/*      In this problem, we have given N integers. We need to find the maximum number of unique integers among all the possible contiguous subarrays of size M.

Note: Time limit is 3 second for this problem.

Input Format :-

The first line of input contains two integers N and M: representing the total number of integers and the size of the subarray, respectively.
The next line contains N space separated integers.

Constraints :-

1<= N <=100000
1<= M <=100000
M <= N

The numbers in the array will range between [0, 10000000].

Output Format :-

Print the maximum number of unique integers among all possible contiguous subarrays of size M.

Sample Input :-

6 3
5 3 5 2 3 2

Sample Output :-

3

Explanation :-

In the sample testcase, there are 4 subarrays of contiguous numbers.

s1 = (5,3,5) - Has 2 unique numbers.

s2 = (3,5,2) - Has 3 unique numbers.

s3 = (5,2,3) - Has 3 unique numbers.

s4 = (2,3,2) - Has 2 unique numbers.

In these subarrays, there are 2,3,3,2 unique numbers, respectively. The maximum amount of unique numbers among all possible contiguous subarrays is 3.          */



  import java.util.*;

public class test {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Deque<Integer> deque = new ArrayDeque<>();
        HashSet<Integer> set = new HashSet<>();
        
        int n = in.nextInt();
        int m = in.nextInt();
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            int input = in.nextInt();
            
            deque.add(input);
            set.add(input);
            
            if (deque.size() == m) {
                if (set.size() > max) max = set.size();
                int first = deque.remove();
                if (!deque.contains(first)) set.remove(first);
            }
        }
        
        System.out.println(max);
    }
}
