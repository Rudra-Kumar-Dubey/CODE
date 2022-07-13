class First {
    void get()
    {
        System.out.println("First's get()");
    }
}
class Second extends First {
    void get()
    {
        System.out.println("Second's get()");
    }
}

public class Overriding {

    void sum(int a ,long b){
        System.out.println(a+b);
    }
    void sum(int a, int b,int c){
        System.out.println(a+b+c);
    }
    public static void main(String[] args){
        First obj1 = new First();
        obj1.get();
        First obj2 = new Second();
        obj2.get();
        Overriding obj = new Overriding();
        obj.sum(10, 10, 10);
        obj.sum(10, 10);
    }
}
