class Student{
    String name;
    void setName(String name){
        this.name = name;
    }
    String getName(){
        return name;
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
public class Hierarchial_Inheritance {
    public static void main(String[] args) {
        Marks mk = new Marks();
        mk.rollno();
        mk.setName("Ram");
        mk.getName();
        mk.marks();

    }
}
