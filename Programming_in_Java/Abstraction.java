abstract class Stud{
    void name(){
        System.out.println("Ram");
    }
    void mark(){}
}
class Details extends Stud  {
    public void mark(){
        System.out.println(100);
    }
}

public class Abstraction {
    public static void main(String[] args) {
        Details d = new Details();
        d.name();
        d.mark();
    }
    
}
