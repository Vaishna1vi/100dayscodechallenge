/*   In the given problem, we are creating a File that will be store in directory path which we'll give and then we wil save the data with the help of writer class.
     After that we will find the number of vowels and consonants from that stored data and print them.
     Writer is an abstract class that is designed for streaming character output.
     FileWriter creates a Writer that we can use to write to a file. 
     
Input Format :- 
     
String which we will give with the help of write() function that is a method of Writer class. It will store as the text file in the given directory path.
     
Output Format :-

Display the number of vowels and consonants with the help of count function using for loop and if else condition.

Input :-

Now is the time for all good men to come to the aid of their country and pay their due taxes.

Output :-

Number of vowels: 25
Number of consonant: 68                               */



import java.io.*;
public class File_ex {
    public static void main(String args[]) throws IOException {

String source = "Now is the time for all good men " + "to come to the aid of their country " + "and pay their due taxes.";
int count1 = 0;
int count2 = 0;

char buffer[] = new char[source.length()];
source.getChars(0,source.length(),buffer,0);

FileWriter f0 = new FileWriter("D:\\file1.txt");
f0.write(buffer);
f0.close();

for (int i=0;i<buffer.length;i++) {
if (source.charAt(i)=='a'||source.charAt(i)=='e'||source.charAt(i)=='o'||source.charAt(i)=='u') {
    count1++;
}
else{
    count2++;
}
}
System.out.println("Number of vowels: " +count1);
System.out.println("Number of consonant: "+ count2);
   }
    }
