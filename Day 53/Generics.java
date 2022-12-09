/*    Generics means parameterized types. The idea is to allow type (Integer, String, … etc., and user-defined types) to be a parameter to methods, classes, and interfaces.
      Using Generics, it is possible to create classes that work with different data types.
      
A generic class is implemented exactly like a non-generic class. The only difference is that it contains a type parameter section.

In this given problem, We are using generic method in which datatype is not specified at the starting.
With the help of parametrized constructor, we will pass the value of created objects as a integer type and a string type in main method.

In the showType() method, we will show the ob1 and ob2 by calling getClass() and getName() method.

Output :-
  
  Type of T is java.lang.Integer
Type of V is java.lang.String
value: 88
value: Generics                            */



class TwoGen<T, V> {
    T ob1;
    V ob2;
    TwoGen(T o1, V o2) {
        ob1 = o1;
        ob2 = o2;
    }

    void showTypes() {
        System.out.println("Type of T is " + ob1.getClass().getName());
        System.out.println("Type of V is " + ob2.getClass().getName());
    }
    T getob1() {
        return ob1;
    }
    V getob2() {
        return ob2;
    }
}
 class SimpGen {
    public static void main(String [] args) {
        TwoGen<Integer, String>tgObj = new TwoGen<Integer, String>(88, "Generics");
        tgObj.showTypes();
        int v = tgObj.getob1();
        System.out.println("value: " + v);
        String str = tgObj.getob2();
        System.out.println("value: " + str);
    }
}
