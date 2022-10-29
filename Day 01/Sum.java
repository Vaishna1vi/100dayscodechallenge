/* Taking 2 input from the user number 1 and number 2 print the sum of it.

Sample input :
Enter the number 1: 17
Enter the number 2: 44

Sample Output :
Sum of 2 numbers : 61  */


import java.util.*;
class Sum {
    public static void main(String[] args) {
        
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the number 1:");
      int num1 = sc.nextInt();
      System.out.println("Enter the number 2:");
      int num2 = sc.nextInt();
      System.out.println("number 1 = " +num1);
      System.out.println("number 2 = " +num2);
      
      int Sum = num1+num2;
        System.out.println("Sum of 2 numbers:" +Sum);
    }
}
