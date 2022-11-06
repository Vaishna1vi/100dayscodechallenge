/*    Function Description :-

canWin has the following parameters:

int leap: the size of the leap
int game[n]: the array to traverse

Returns :-

boolean: true if the game can be won, otherwise false

Input Format :-

The first line contains an integer,q, denoting the number of queries (i.e., function calls).
The 2.q subsequent lines describe each query over two lines:

The first line contains two space-separated integers describing the respective values of n and leap.
The second line contains n space-separated binary integers (i.e., zeroes and ones) describing the respective values of game0,game1,......,game(n-1).

Constraints :-

1<=q<=5000
2<=n<=100
0<=leap<=100
It is guaranteed that the value of game[0] is always 0.

Sample Input :-

STDIN           Function
-----           --------
4               q = 4 (number of queries)
5 3             game[] size n = 5, leap = 3 (first query)
0 0 0 0 0       game = [0, 0, 0, 0, 0]
6 5             game[] size n = 6, leap = 5 (second query)
0 0 0 1 1 1     . . .
6 3
0 0 1 1 1 0
3 1
0 1 0

Sample Output :-

YES
YES
NO
NO

Explanation :-

We perform the following q=4 queries:

For game=[0,0,0,0,0] and leap=3, we can walk and/or jump to the end of the array because every cell contains a 0. Because we can win, we return true.
For game=[0,0,0,1,1,1] and leap=5, we can walk to index 1 and then jump i+leap=1+5=6 units to the end of the array. Because we can win, we return true.
For game=[0,0,1,1,1,0] and leap=3, there is no way for us to get past the three consecutive ones. Because we cannot win, we return false.
For game=[0,1,0] and leap=1, there is no way for us to get past the one at index 1. Because we cannot win, we return false.                  */



import java.util.*;

public class Solution {

    public static boolean canWin(int leap, int[] game) {
         VirtualPlayer v = new VirtualPlayer(leap, game);
    v.tick();
    return v.winnable;

}
static class VirtualPlayer {
    private int pos = 0; //pos-ition
    private int lp; //lp means leap
    private int[] map;
    boolean winnable = false;
    public VirtualPlayer(int lp, int[] map) {
        this.lp = lp; //gets the values from the canWin function
        this.map = map;

    }
    private void moveup() {
        if (map[pos + 1] == 0) {
            pos++;
            tick();
        }

    }

    private void movedown() {
        if ((pos - 1) >= 0 && map[pos - 1] == 0) {
            map[pos] = 1;
            pos--;
            tick();
        }

    }

    private void jump() {
        if ((pos + lp) < map.length) {
            if (map[pos + lp] == 0) {
                int posold = pos;
                pos = pos + lp;
                tick();
                pos = posold;
            }
        }

    }
    void tick() {
        //System.out.println("im at:"+pos);
        if (pos == (map.length - 1) || ((pos + lp) >= map.length)) {
            winnable = true;
        }
        else {
            this.moveup();
            if (lp != 0) {
                this.jump();
            } //cant jump 0 steps!
            this.movedown();
        }

    }

}

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int q = scan.nextInt();
        while (q-- > 0) {
            int n = scan.nextInt();
            int leap = scan.nextInt();
            
            int[] game = new int[n];
            for (int i = 0; i < n; i++) {
                game[i] = scan.nextInt();
            }

            System.out.println( (canWin(leap, game)) ? "YES" : "NO" );
        }
        scan.close();
    }
}
