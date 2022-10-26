/*    The Calendar class is an abstract class that provides methods for converting between a specific instant in time and a set of calendar fields 
       such as YEAR, MONTH, DAY_OF_MONTH, HOUR, and so on, and for manipulating the calendar fields, such as getting the date of the next week.
       
       We have given a date. We just need to write the method, getDay, which returns the day on that date. 
     
     Function Description :-
                             findDay has the following parameters:

                                      int: month
                                      int: day
                                      int: year
                                      
Returns :-
           string: the day of the week in capital letters.
             
Input Format :-
                  A single line of input containing the space separated month, day and year, respectively, in MM DD YYYY format.
                  
Constraints :-    2000<year<3000

Sample Input :-
                    08 05 2015
Sample Output :-
                    WEDNESDAY
Explanation :-
                 The day on August 5th 2015 was WEDNESDAY.                          */


import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Result {
   public static String findDay(int month, int day, int year) {
        
       Calendar cal = Calendar.getInstance();
         cal.set(Calendar.MONTH, month-1);
         cal.set(Calendar.DAY_OF_MONTH, day);
         cal.set(Calendar.YEAR, year);

        String[] day_of_week = {"SUNDAY", "MONDAY", "TUESDAY",   "WEDNESDAY", "THURSDAY", "FRIDAY","SATURDAY"};

        return day_of_week[cal.get(Calendar.DAY_OF_WEEK)-1];

    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int month = Integer.parseInt(firstMultipleInput[0]);

        int day = Integer.parseInt(firstMultipleInput[1]);

        int year = Integer.parseInt(firstMultipleInput[2]);

        String res = Result.findDay(month, day, year);

        bufferedWriter.write(res);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
