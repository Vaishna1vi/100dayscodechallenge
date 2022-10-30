/*  Given a string, s, and an integer, k, complete the function so that it finds the lexicographically smallest and largest substrings of length k.

Function Description :-

getSmallestAndLargest has the following parameters:

                 string s: a string
                 int k: the length of the substrings to find
                 
Returns :-

string: the string ' + "\n" + ' where and are the two substrings

Input Format :-

The first line contains a string denoting s.
The second line contains an integer denoting k.

Constraints :-

1<=|s|<=1000
s consists of English alphabetic letters only (i.e., [a-zA-Z]).

Sample Input :-
                 welcometojava
                 3
                 
Sample Output :-
                 ava
                 wel                                              */



import java.util.Scanner;

public class Solution {

    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";
        
        for(int i = 0;i<=s.length()-k;i++){
             String subString = s.substring(i,i+k);
             if(i == 0){
                 smallest = subString;
             }
             if(subString.compareTo(largest)>0){
                 largest = subString;
             }else if(subString.compareTo(smallest)<0)
                 smallest = subString;
      }
        
        return smallest + "\n" + largest;
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();
      
        System.out.println(getSmallestAndLargest(s, k));
    }
}
