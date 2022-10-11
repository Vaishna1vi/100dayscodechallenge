/*  in the given problem we convert the datatype of given character value and performing maths operation on it.

Sample input :
        char d = 'd'
        char g = 'g'
Sample Output :
            Character value of d : d
            Character value of g : g
            Integer value of d : 100
            Integer value of g : 103
            Added value of d and g : 203
            Subtracted value of g and d : 3
            Multiplicated value of d and g : 10300
            Divided value of g and d : 1       */


 public class Conversion {
    public static void main(String[] args) {
        char d = 'd';
        char g = 'g';
        System.out.println("Character value of d : " +d);
        System.out.println("Character value of g : " +g);
        System.out.println("Integer value of d : " +(int) (d));
        System.out.println("Integer value of g : " +(int) (g));
        System.out.println("Added value of d and g : " +(d+g));
        System.out.println("Subtracted value of g and d : " +(g-d));
        System.out.println("Multiplicated value of d and g : " +(d*g));
        System.out.println("Divided value of g and d : " +(g/d));
    }
}
