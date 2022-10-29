/* In the given problem we are counting the even and odd between the given range by the user

Sample input 1 :
Enter the value of L:
45
Enter the value of R:
99
Sample output 1 :
Count of odd numbers is 28
Count of even numbers is 27

Sample input 2 :
Enter the value of L:
12
Enter the value of R:
91
Sample output 2 :
Count of odd numbers is 40
Count of even numbers is 40   */



import java.util.*;
class EvenOdd {
    static int countOdd(int L, int R)
    {
        int N = (R - L) / 2;
        if (R % 2 != 0 || L % 2 != 0)
            N++;
        return N;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of L:");
        int L = sc.nextInt();
        System.out.println("Enter the value of R:");
        int R = sc.nextInt();
 
        int odds = countOdd(L, R);
        int evens = (R - L + 1) - odds;
        System.out.println("Count of odd numbers is " + odds);
        System.out.println("Count of even numbers is " + evens);
    }
}
