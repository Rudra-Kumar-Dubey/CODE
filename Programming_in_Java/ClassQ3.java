/*Write a program to create interface named test. In this interface the
member function is square. Implement this interface in arithmetic class.
Create one new class called ToTestInt in this class use the object of
arithmetic class.*/

interface test{
    String square();
}

class arithmetic implements test{
    public String square(){
        return "This is square";
    }
}

class ToTestInt{
    public void arr(){
        arithmetic a = new arithmetic();
        System.out.println(a.square());
    }

}

public class ClassQ3 {
    public static void main(String[] args) {
        ToTestInt T = new ToTestInt();
        T.arr();
        
    }
}
