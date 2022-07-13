/*Create an abstract class 'Bank' with an abstract method 'getBalance'. 
$100, $150 and $200 are deposited in banks A, B and C respectively. 
'BankA', 'BankB' and 'BankC' are subclasses of class 'Bank', each having a method named 'getBalance'.
Call this method by creating an object of each of the three classes.*/

abstract class Bank{
    abstract void getBalance();
}

class A extends Bank {
    void getBalance(){
        System.out.println("$100");
    }
}

class B extends Bank {
    void getBalance(){
        System.out.println("$150");
    }
}

class C extends Bank {
    void getBalance(){
        System.out.println("$200");
    }
}


public class ClassQ2 {
    public static void main(String[] args) {
        A a =new A();
        a.getBalance();

        B b =new B();
        b.getBalance();

        C c =new C();
        c.getBalance();
        
    }
}
