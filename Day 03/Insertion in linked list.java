/* insertion of the elements in linked list 

sample input : 11 , 21 , 10, 10 ,20, 31 , key = 10
sample output : 11 -> 21 -> 10 -> 10 -> 20 -> 31
sample output : 2  */

class Node {
    int data;
    Node next;
}

public class List {
    Node head;
    Node tail;
    int size;

    void insertattail(int val) {  // val =10
        Node temp = new Node();
        temp.data = val;
        temp.next = null;

        if(size==0) {
            head=tail=temp;
        }
        else {
            tail.next=temp;
            tail=temp;
        }
        size++;
    }

    void print() {
       Node temp=head;
       for(int i=0;i<size;i++)
       {
        System.out.print(temp.data +" ");
         temp=temp.next;
       }
    }
    void count(int target)
    {
      int cnt=0;
      Node t=head;
      while(t!=null)
      {
        if(t.data==target)
        {
            cnt++;
        }
        t=t.next;
      }  
      System.out.println();
      System.out.println(cnt);
    }
       public static void main(String args[]) {
 List li = new List();

 li.insertattail(11);
 li.insertattail(21);
 li.insertattail(10);
 li.insertattail(10);
 li.insertattail(20);
 li.insertattail(31);




 li.print();
 li.count(10);

       
    }
}
