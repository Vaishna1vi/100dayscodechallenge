/*    A Java interface can only contain method signatures and fields. The interface can be used to achieve polymorphism. In this problem, we will practice our knowledge on interfaces.

We have given an interface AdvancedArithmetic which contains a method signature int divisor_sum(int n). We need to write a class called MyCalculator which implements the interface.

divisorSum function just takes an integer as input and return the sum of all its divisors. For example divisors of 6 are 1, 2, 3 and 6, so divisor_sum should return 12. The value of n will be at most 1000.

Sample Input :-

6

Sample Output :-

I implemented: AdvancedArithmetic
12

Explanation :-

Divisors of 6 are 1,2,3 and 6. 1+2+3+6=12.           */




import java.util.*;
interface AdvancedArithmetic{
  int divisor_sum(int n);
}
class MyCalculator implements AdvancedArithmetic {
   public int divisor_sum(int n){
       if (n <= 1) { return n; }
        int res = n + 1;
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                res += i;
            }
        }

        return res;
   }
}
//Write your code here

class Solution{
    public static void main(String []args){
        MyCalculator my_calculator = new MyCalculator();
        System.out.print("I implemented: ");
        ImplementedInterfaceNames(my_calculator);
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.print(my_calculator.divisor_sum(n) + "\n");
      	sc.close();
    }
    /*
     *  ImplementedInterfaceNames method takes an object and prints the name of the interfaces it implemented
     */
    static void ImplementedInterfaceNames(Object o){
        Class[] theInterfaces = o.getClass().getInterfaces();
        for (int i = 0; i < theInterfaces.length; i++){
            String interfaceName = theInterfaces[i].getName();
            System.out.println(interfaceName);
        }
    }
}

