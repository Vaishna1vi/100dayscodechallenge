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
