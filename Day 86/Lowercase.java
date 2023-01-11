/*      In the given problem, convert the string which is in uppercase to the lowercase string. Take the String as input from the user.

Input Format :-

String which is in uppercase, only A to Z characters are allowed.

Output Format :-

Converted string which is in lowercase, it gives invalid string if input does not follow uppercase characters.

Constraints :-

A<= ch <=Z (33-126)

Input 0 :-

JAVA

Output 0 :-

java

Input 1 :-

START THE CODE 

Output 1 :-

start the code                        */





import java.util.Scanner;

public class Substring {
    private static Scanner sc;
     
    public static void main(String a[]) {
        String Str;
    System.out.println("Enter the String: ");
 
 sc= new Scanner(System.in);
 Str=sc.nextLine();
  
    System.out.println("The string converted into Lowercase: ");
    for(int i=0;i<Str.length();i++)
    {
    char ch=Str.charAt(i);
    if(ch>='A'&&ch<='z') {
        ch=(char) (ch+32);
    }
   System.out.print(ch); 
    }
    }
}
