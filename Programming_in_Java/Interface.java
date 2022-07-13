
//import java.io.*;

interface Display{

	void display();
    
}

interface Name{

    void name();

}


class TestClass implements Display, Name{

	public void display(){
		System.out.println("Hello, there");
	}

    public void name(){
        System.out.println("VSCODE USER");
    }

}

class TestClass2 implements Name{

    public void name(){
        System.out.println("And Raj");
    }

}
class Interface{
public static void main (String[] args){
		TestClass k = new TestClass();
        TestClass2 j = new TestClass2();
		k.display();
        k.name();
        j.name();
	}
}
