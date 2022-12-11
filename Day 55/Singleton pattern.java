/*    Input Format :-

You will not be handling any input in this challenge.

Output Format :-

You will not be producing any output in this challenge.

Sample Input :-

hello world

Sample Output :-

Hello I am a singleton! Let me say hello world to you                 */




import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.lang.reflect.*;


class Singleton{
private volatile static Singleton instance;
    public static String str;
    private Singleton() {}
    
    static Singleton getSingleInstance() {
        if (instance == null) {
            synchronized (Singleton.class) {
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }

}
