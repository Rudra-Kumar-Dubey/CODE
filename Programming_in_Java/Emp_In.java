

class Emp{
    String empName(){
        return("Ram");
    }
}
class Edata extends Emp{
    void empID()
    {
        System.out.println(231);
    }
}
class Profession extends Edata{
    void Work()
    {
        System.out.println("Engineer");
    }
}
public class Emp_In{

    public static void main(String[] args) {
        Profession p = new Profession();
        p.empName();
        p.empID();
        p.Work();

    }
}