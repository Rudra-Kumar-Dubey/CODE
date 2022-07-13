class Student{
    void name()
    {
        System.out.println("Name: Ram");
    }
}
class Sdata extends Student{
    void rollno()
    {
        System.out.println(101);
    }
}
class Marks extends Sdata{
    void marks()
    {
        System.out.println("Marks:" + 500);
    }
}
public class Inheritance {
    public static void main(String[] args) {
        Marks m =  new Marks();
        m.rollno();
        m.name();
        m.marks();

    }
}
