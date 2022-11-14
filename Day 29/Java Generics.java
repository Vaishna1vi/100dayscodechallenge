/*     Generic methods are a very efficient way to handle multiple datatypes using a single method. 
       We have an integer array and a string array. We have to write a single method printArray that can print all the elements of both arrays.
       The method should be able to accept both integer arrays or string arrays.

It will print the following lines, after executing the code:

1
2
3
Hello
World                                       */



import java.io.IOException;
import java.lang.reflect.Method;

class Printer
{
   //Write your code here
public static <E> void printArray(E[] inputArray )
   {
for (E element : inputArray)
      System.out.printf("%s\n", element);
   }
}

public class Solution {


    public static void main( String args[] ) {
        Printer myPrinter = new Printer();
        Integer[] intArray = { 1, 2, 3 };
        String[] stringArray = {"Hello", "World"};
        myPrinter.printArray(intArray);
        myPrinter.printArray(stringArray);
        int count = 0;

        for (Method method : Printer.class.getDeclaredMethods()) {
            String name = method.getName();

            if(name.equals("printArray"))
                count++;
        }

        if(count > 1)System.out.println("Method overloading is not allowed!");
      
    }
}
