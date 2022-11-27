/*       When a method in a subclass overrides a method in superclass, it is still possible to call the overridden method using super keyword.
         If we write super.func() to call the function func(), it will call the method that was defined in the superclass.
         
  In the given problem, We have a SuperClass BiCycle and a SubClass MotorCycle that inherits the properties of SuperClass.
  It overrides the method of SuperClass and with the help of Super Keyword We are calling the overridden method.

We have to write the code so that it will prints the following text:

Hello I am a motorcycle, I am a cycle with an engine.
My ancestor is a cycle who is a vehicle with pedals.                  */




import java.util.*;
import java.io.*;

class BiCycle{
	String define_me(){
		return "a vehicle with pedals.";
	}
}

class MotorCycle extends BiCycle{
	String define_me(){
		return "a cycle with an engine.";
	}
	
	MotorCycle(){
		System.out.println("Hello I am a motorcycle, I am "+ define_me());

		String temp=super.define_me();

		System.out.println("My ancestor is a cycle who is "+ temp );
	}
	
}
class Solution{
	public static void main(String []args){
		MotorCycle M=new MotorCycle();
	}
}
