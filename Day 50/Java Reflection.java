/*         JAVA reflection is a very powerful tool to inspect the attributes of a class in runtime. For example, we can retrieve the list of public fields of a class using getDeclaredMethods().

In this problem,we will have given a class Solution. We have to print all the methods of another class called Student in alphabetical order. 

class Student{
    private String name;
    private String id;
    private String email;

    public String getName() {
        return name;
    }
    public void setId(String id) {
        this.id = id;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public void anothermethod(){  }
    ......
    ......
    some more methods
    ......
}
We have to print all the methods of the student class in alphabetical order like this:

anothermethod
getName
setEmail
setId
......
......
some more methods
......
There is no sample input/output for this problem.                         */





public class Solution {
    public static void main(String[] args) {
        Class student = Student.class; 
        Method[] methods = student.getDeclaredMethods();
        
        ArrayList<String> methodNames = new ArrayList();
        for (Method method : methods) {
            methodNames.add(method.getName());
        }
       
        Collections.sort(methodNames);
        for (String name: methodNames) {
            System.out.println(name);
        }
    }
}
