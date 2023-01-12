/* In the given question, we have a string and we have to find all the possible ways in which we can arrange the letters of the given string to form new words with meaning
   or without meaning.
   
   
   Input Format :-
   
   Given input is in characters or in string only.
   
   Output Format :-
   
   all possible words by arranging the letters of given string or word.
   
   Constraints :-
   
   1 to 9
   A to Z
   a to z
   
   Input 0 :-
   
   1234
   
   Output 0 :-
   
   All the permutations of the string are:
       
       1234
       1243
       1324
       1342
       1432
       1423
       2134
       2143
       2314
       2341
       2431
       2413
       3214
       3241
       3124
       3142
       3412
       3421
       4231
       4213
       4321
       4312
       4132
       4123
       
   Input 1 :-
   
   ABC
   
   Output 1 :-
   
   All the permutations of the string are: 
   
    ABC
    ACB
    BAC
    BCA
    CBA
    CAB                                                 */





import java.util.Scanner;
public class PermuteString {    
    //Function for swapping the characters at position I with character at position j    
    public static String swapString(String a, int i, int j) {    
        char[] b =a.toCharArray();    
        char ch;    
        ch = b[i];    
        b[i] = b[j];    
        b[j] = ch;    
        return String.valueOf(b);    
    }    
        
    public static void main(String[] args)    
    {    
         Scanner sc = new Scanner(System.in);
       String str = sc.nextLine();   
        int len = str.length();    
        System.out.println("All the permutations of the string are: ");    
        generatePermutation(str, 0, len);    
    }    
        
    //Function for generating different permutations of the string    
    public static void generatePermutation(String str, int start, int end)    
    {    
        //Prints the permutations    
        if (start == end-1)    
            System.out.println(str);    
        else    
        {    
            for (int i = start; i < end; i++)    
            {    
                //Swapping the string by fixing a character    
                str = swapString(str,start,i);    
                //Recursively calling function generatePermutation() for rest of the characters     
                generatePermutation(str,start+1,end);    
                //Backtracking and swapping the characters again.    
                str = swapString(str,start,i); 
            }    
        }    
    }    
}    
       
