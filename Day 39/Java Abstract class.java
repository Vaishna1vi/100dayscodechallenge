/*   A Java abstract class is a class that can't be instantiated. That means we cannot create new instances of an abstract class. It works as a base for subclasses. 

Following is an example of abstract class:

abstract class Book{
    String title;
    abstract void setTitle(String s);
    String getTitle(){
        return title;
    }
}

we have to create another class that extends the abstract class. Then we can create an instance of the new class.

Notice that setTitle method is abstract too and has no body. That means we must implement the body of that method in the child class.

Our class mustn't be public.

Sample Input :-

A tale of two cities

Sample Output :-

The title is: A tale of two cities            */





import java.util.*;
abstract class Book{
	String title;
	abstract void setTitle(String s);
	String getTitle(){
		return title;
	}
}
class MyBook extends Book{
       void setTitle(String s){
        this.title = s;
    }

}
//Write MyBook class here

public class Main{
	
	public static void main(String []args){
		//Book new_novel=new Book(); This line prHMain.java:25: error: Book is abstract; cannot be instantiated
		Scanner sc=new Scanner(System.in);
		String title=sc.nextLine();
		MyBook new_novel=new MyBook();
		new_novel.setTitle(title);
		System.out.println("The title is: "+new_novel.getTitle());
      	sc.close();
		
	}
}
