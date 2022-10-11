/* Java stdin and stdout
         we have given the question in which we have to take input from the user of different data types and give the output according it.
         
         Input Format: There are three lines of input-                      

           The first line contains an integer.
           The second line contains a double.
           The third line contains a String.
           
           Output Format: There are three lines of output:
           
           On the first line, print String: input value of string data type
           On the second line, print Double: input value of double data type 
           On the third line, print Int: input value of int data type
        
        Sample Input :   
                         42
                         3.1415
                         Welcome to HackerRank's Java tutorials!
                         
       Sample output :
                         String: Welcome to HackerRank's Java tutorials!
                         Double: 3.1415
                         Int: 42           */
                         
                         
                         
 import java.util.Scanner;

 public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i = scan.nextInt(); 
        double d = scan.nextDouble();
        scan.nextLine();  
        String s = scan.nextLine(); 
            

        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
    }
}
