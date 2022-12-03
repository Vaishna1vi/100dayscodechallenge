/*    In the given problem, we are using collection framework. It consist of methods of various data Structures.
      Here we are using ArrayList data structure which is a type of List data structure and data type is integer.
      With the help of .add() function we can add the element in the ArrayList,and with the help of .remove() function we can delete the element from the ArrayList.
      In the remove() function, we have to pass the index value; not the element. Index value always start with 0.

Output Format :-

First, it will add all the element which we are passing in add() method, in ArrayList.
Second, it will delete the element from the ArrayList of that Particular index value which we are passing in remove() method,
then at last it will display the remaining elements in the output screen.

Output :- 

45
60
34
44                                         */




import java.awt.Color;
import java.util.ArrayList;
import java.util.Iterator;

class Collection1 {
    public static void main (String [] args) {
        ArrayList<Integer> list1 = new ArrayList<Integer>();
        list1.add(45);
        list1.add(60);
        list1.add(34);
        list1.add(83);
        list1.add(44);
        list1.remove(3);
        Iterator it = list1.iterator();
        while(it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
