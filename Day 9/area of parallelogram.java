/* In the given Problem we take Breadth and Height as a input from the user and give the area of a parallelogram as a output.

If B<=0 or H<=0, the output should be "java.lang.Exception: Breadth and height must be positive."

Constraints :-    
                 -100<= B <=100
                 -100<= H <=100

Input Format:-
                  There are two lines of input. The first line contains B: the breadth of the parallelogram. 
                  The next line contains H: the height of the parallelogram.
                  
Output Format:-
                  If both values are greater than zero, then the main method must output the area of the parallelogram. 
                  Otherwise, print "java.lang.Exception: Breadth and height must be positive" without quotes.                */


import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

static boolean flag = true; 
static int B,H;

static{

Scanner scan = new Scanner(System.in);
B = scan.nextInt();
scan.nextLine();
H = scan.nextInt();
scan.close();
if(B>0 && H>0){
    flag = true;

}else if(B<=0 || H<=0){
    flag=false;
    System.out.println("java.lang.Exception: Breadth and height must be positive");
}
}

public static void main(String[] args){
  	if(flag){
			int area=B*H;
			System.out.print(area);
		}
		
	}//end of main

}//end of class
