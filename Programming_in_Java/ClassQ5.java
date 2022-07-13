/*Write a program to create a class named shape. In this class we have three
sub classes circle, triangle and square each class has two member function
named draw () and erase (). Create these using polymorphism concepts.*/

class shape{
    void draw(){
        System.out.println("Shape Draw");
    };
    void erase(){
        System.out.println("Shape Erase");
    }
}

class circle extends shape{
    void draw(){
        System.out.println("Circle Draw");
    };
    void erase(){
        System.out.println("Circle Erase");
    }
}

class triangle extends shape{
    void draw(){
        System.out.println("Triangle Draw");
    };
    void erase(){
        System.out.println("Triangle Erase");
    }
}

class square extends shape{
    void draw(){
        System.out.println("Square Draw");
    };
    void erase(){
        System.out.println("Square Erase");
    }
}

public class ClassQ5 {
    public static void main(String[] args) {
        circle c = new circle();
        square s = new square();
        triangle t = new triangle();
        c.draw();
        c.erase();
        s.draw();
        s.erase();
        t.draw();
        t.erase();
    }
}
