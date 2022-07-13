class Outer{
    void get(){
        System.out.println("Outer");
    }
    class Inner{
        void disp(){
            System.out.println("Inner");
        }
    }
}


public class Nestedclass {
    public static void main(String[] args) {
        Outer out = new Outer();
        out.get();

        Outer.Inner in = out.new Inner();
        in.disp();
    }
}
