/* In the given problem we are checking divisibility of the number given by user with 5 and 7 using nested if else

Sample input 1 : 
Enter the Number: 45
Sample output 1 : 
Divisible by 5 but not by 

Sample input 2 : 
Enter the Number: 35
Sample output 2 :
Divisible by both 5 and 7

Sample input 3 :
Enter the Number: 14
Sample output 3 :
Divisible by 7 but not by 5    */

import java.util.*;
class Divisible { 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number:");
        int n = sc.nextInt();
        int r1,r2;
        r1 = n%5; r2 = n%7;
    if(r1==0) {
        if(r2==0) {
            System.out.println("Divisible by both 5 and 7");
        }
        else {
            System.out.println("Divisible by 5 but not by 7");
        }
    }
        else {
            if(r2==0) {
            System.out.println("Divisible by 7 but not by 5");
        }
        else {
            System.out.println("Not divisible by both 5 and 7");
        }
    }
}
}
