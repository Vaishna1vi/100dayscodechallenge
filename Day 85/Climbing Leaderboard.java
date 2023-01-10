/*     An arcade game player wants to climb to the top of the leaderboard and track their ranking. The game uses Dense Ranking, so its leaderboard works like this:

The player with the highest score is ranked number 1 on the leaderboard.
Players who have equal scores receive the same ranking number, and the next player(s) receive the immediately following ranking number.

Function Description :-

Complete the climbingLeaderboard function.

climbingLeaderboard has the following parameter(s):

int ranked[n]: the leaderboard scores
int player[m]: the player's scores

Returns :-

int[m]: the player's rank after each new score

Input Format :-

The first line contains an integer n, the number of players on the leaderboard.
The next line contains n space-separated integers ranked[i], the leaderboard scores in decreasing order.
The next line contains an integer, m, the number games the player plays.
The last line contains m space-separated integers player[j], the game scores.

Subtask :-

For 60% of the maximum score:
1<= n <=200
1<= m <=200

Sample Input 1 :-

Array: ranked
100
100
50
40
40
20
10

Array: player
5
25
50
120

 
7
100 100 50 40 40 20 10
4
5 25 50 120

Sample Output 1 :-

6
4
2
1

Sample Input 2 :-

Array: ranked
100
90
90
80
75
60

Array: player
50
65
77
90
102

 
6
100 90 90 80 75 60
5
50 65 77 90 102

Sample Output 2

6
5
4
2
1                               */






import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] scores = new int[n];
        for(int scores_i=0; scores_i < n; scores_i++){
            scores[scores_i] = in.nextInt();
        }
        int m = in.nextInt();
        int[] alice = new int[m];
        for(int alice_i=0; alice_i < m; alice_i++){
            alice[alice_i] = in.nextInt();
        }
        printScores(n, scores, alice);
    }
    
    public static void printScores(int n, int[] scores, int[] alice){
        ArrayList<Integer> places = new ArrayList<Integer>();
        int place = 1;
        places.add(scores[0]);
        for(int i = 1; i < scores.length; i++){
            int currPlace = place-1;
            int currScore = scores[i];
            if(currScore != places.get(currPlace)){
                place++;
                places.add(currScore);
            }
        }
        
        int currPlace = places.size() + 1;
        for(int i = 0; i < alice.length; i++){
            currPlace = getPlace(currPlace, alice[i], places);
            System.out.println(currPlace);
        }
        
    }
    
    public static int getPlace(int currPlace, int currScore, ArrayList<Integer> places){
        for(int i = currPlace - 1; i > 0; i--){
            int index = i - 1;
            if(currScore < places.get(index)){
                return i + 1;
            }
        }
        return 1;
    }
    
    
    
    
}
