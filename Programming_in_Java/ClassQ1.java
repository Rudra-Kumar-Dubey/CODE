/*Create an abstract class 'Parent' with a method 'message'. 
It has two subclasses each having a method with the same name 'message' 
that prints "This is first subclass" and "This is second subclass" respectively. 
Call the methods 'message' by creating an object for each subclass.*/


abstract class Parent{
    abstract void message();
}

class SubClass1 extends Parent {
    void message(){
        System.out.println("This is first subclass");
    }
}

class SubClass2 extends Parent {
    void message(){
        System.out.println("This is second subclass");
    }
}

public class ClassQ1 {
    public static void main(String[] args) {
        SubClass1 S1 = new SubClass1();
        S1.message();
        SubClass2 S2 = new SubClass2();
        S2.message();    
    }
    
}
