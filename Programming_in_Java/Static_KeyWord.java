class Study{
    static int a;
    static void Display(){
        System.out.println("Display");
    }
    static{
        a = 10;
        System.out.println("Static Program");
        System.out.println(a);    
    }
}

public class Static_KeyWord{
    public static void main(String[] args){
        Study.Display();
    }
}

// class Main
// {
// static int a=10;
// static void display()
// {
// System.out.println("Display");
// }
// public static void main(String[] args)
// {
// System.out.println(a);
// display();
// }
// }