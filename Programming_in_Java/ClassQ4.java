/*Write a program suppose, it is required to build a project consisting of a
number of classes, possibly using a large number of programmers. It is
necessary to make sure that every class from which all other classes in the
project will be inherited. Since any new classes in the project must inherit
from the base class, programmers are not free to create a different
interface. Therefore, it can be guaranteed that all the classes in the project
will respond to the same debugging commands.*/

class base{
    void dump(){
        System.out.println("debug error: no dump() defined for the class");
    }
}

class A extends base{
    int a=1,b=3,c=2;
    void dump(){
        System.out.println("a = "+a +"b = "+b+"c = "+c);
    }
}

class B extends base{
    int a=4,b=7,c=8;
    void dump(){
        System.out.println("a = "+a +"b = "+b+"c = "+c);
    }
}

class C extends base{
    int a=8,b=4,c=3;
    void dump(){
        System.out.println("a = "+a +"b = "+b+"c = "+c);
    }
}

public class ClassQ4 {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        C c = new C();
        a.dump();
        b.dump();
        c.dump();
    }
}
