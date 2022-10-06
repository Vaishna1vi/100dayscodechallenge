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
