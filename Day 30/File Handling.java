/* In the given problem, we are performing the read and close operation on the file by calling it's directory path.
   Also checking the available byte space by the available function in text file.
   
   Input Format :-
   
   In the try block we are giving the Array size is equal to 105 then we check the available byte in the file.
   It will read the data stored in the file by read operation and then it will close the file with close function.
   And if there will be any error then it will perform the exception condition that is written in the catch block.
   
   Output :-
   
Available bytes in the file: 102

Data read from the file: 

This is the text file named as van.
This is the line of text inside the file. Topic of File Handling.

Explanation :-

After reading the file it will display the data stored in that file and it will also show the available bytes in the file.           */



import java.io.*;
public class File {
    
    public static void main (String arg[]) {

        byte[] array = new byte[105];
        
        try {
            FileInputStream f = new FileInputStream("van.txt");
            System.out.println("Available bytes in the file: " + f.available() + "\n");
            f.read(array);
            System.out.println("Data read from the file: \n");
            String data = new String(array);
            System.out.println(data);
            f.close();
        } catch (Exception e) {
            e.getStackTrace();
        }
    }
}
