/*       Given the arrival time of each student and a threshhold number of attendees, determine if the class is cancelled.

Function Description :-

Complete the angryProfessor function. It must return YES if class is cancelled, or NO otherwise.

angryProfessor has the following parameter(s):

int k: the threshold number of students
int a[n]: the arrival times of the n students

Returns :-

string: either YES or NO

Input Format :-

The first line of input contains t, the number of test cases.

Each test case consists of two lines.

The first line has two space-separated integers, n and k, the number of students (size of a) and the cancellation threshold.
The second line contains n space-separated integers (a[1],a[2],....,a[n]) that describe the arrival times for each student.

Constraints :-

1<= t <=10
1<= n <=1000
1<= k <=n
-100<= a[i] <=100

Sample Input :-

2
4 3
-1 -3 4 2
4 2
0 -1 2 1

Sample Output :-

YES
NO                                           */






import java.util.Scanner;

public class AngryProfessor {
    public static void main(String[] args) {
        int numberOfTests = 0;
        Scanner sc =  new Scanner(System.in);
        numberOfTests = sc.nextInt();
        
        for (int i = 0;i < numberOfTests;i++) {
            int N = sc.nextInt();
            int K = sc.nextInt();
            int arrived = 0;
            for (int j = 0;j < N;j++) {
                int currentStudent = sc.nextInt();
                if (currentStudent <= 0) {
                    arrived++;
                }
            }
            if (arrived>=K) {
                System.out.println("NO");
            } else {
                System.out.println("YES");
            }
        }
        
        sc.close();
    }
}
