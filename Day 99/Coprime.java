/* In this problem, we have to take input from the user and find all the co-prime numbers from starting to ending of the given number and print it. Also we have to 
   print the count of total numbers.
   
   Function Description :-
   
   We create a function whose name is GCD. It is a static int function which returns the integer value of b%a and a
   
   Input Format :-
   
   Take input b from the user and initialize a from 1.
   
   Output Format :-
   
   Print the count of total number of coprime factors and also print the coprime numbers till the given value.
   
   Input 0 :-
   
   Enter the value of b: 
   20
   
   Output 0 :-
   
   The numbers which are coprime with the given number are: 
1
3
7
9
11
13
17
19
The total count of numbers are: 8

Input 1 :-

Enter the value of b: 
7

Output 1 :-

The numbers which are coprime with the given number are: 
1
2
3
4
5
6
The total count of numbers are: 6                                           */






class Coprime {
    public static void main(String args[]) {
        System.out.println("Enter the value of b: ");
        Scanner sc=new Scanner(System.in);
        int b=sc.nextInt();
        int count=0;
        if(b>0) {
            System.out.println("The numbers which are coprime with the given number are: ");
            for(int a=1;a<b;a++) {
                if(GCD(a,b)==1)
                {
                    count++;
                    System.out.println(a);
                }
            }
            System.out.println("The total count of numbers are: "+count);  
        }
        else {
            System.out.println("Invalid Input");
        }

    }
    static int GCD(int a, int b) {
        if(a==0)
        return b;
        else
        return GCD(b%a,a);
    }
}
