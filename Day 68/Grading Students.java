/*      Given the initial value of grade for each of Sam's n students, write code to automate the rounding process.

Function Description :-

Complete the function gradingStudents.

gradingStudents has the following parameter(s):

int grades[n]: the grades before rounding

Returns :-

int[n]: the grades after rounding as appropriate

Input Format :-

The first line contains a single integer, n, the number of students.
Each line i of the n subsequent lines contains a single integer, grades[i].

Constraints :-

1<= n <=60
0<= grades[i] <=100

Sample Input :-

4
73
67
38
33

Sample Output :-

75
67
40
33                          */







import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

public static void main(String[] args) {
Scanner in = new Scanner(System.in);
int n = in.nextInt();
for(int a0 = 0; a0 < n; a0++){
int grade = in.nextInt();
// your code goes here
if(grade < 38){
System.out.println(grade);
}
else{
int q = grade/5;
int rem = grade%5;
if(rem >= 3){
System.out.println((q+1)*5);
}
else{
System.out.println(grade);
}
}
}
}
}
