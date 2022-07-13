abstract class Stud
{
abstract void getname();
}
class Mark extends Stud
{
void getname()
{
System.out.println("RAM");
}
void data()
{
System.out.println(100);
}
}
class Mark1 extends Stud
{
void getname()
{
System.out.println("Ram");
}
void data1()
{
System.out.println(101);
}
}



public class Abstraction1
{
public static void main(String[] args)
{
Mark1 m1= new Mark1();
m1.getname();
m1.data1();


}
}
