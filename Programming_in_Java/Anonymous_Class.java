// class student{
//     public void show(){
//         System.out.println("Name");
//     }
// }

// class data extends student{
//     public void show(){
//         System.out.println("Student");
//     }
// }

   

// public class Anonymous_Class {
//     public static void main(String[] args) {

//         student s = new student()
//         {
//             public void show(){
//                 System.out.println("Student");  //Anonymous_Class - It has no name
//             }
//         };
//         s.show();

//         // data d = new data()
//         // d.show();
//     }
// }




//Using Anonymous Class in Interface

interface student{
    public void show();
}

class data implements student{
    public void show(){
        System.out.println("We will override this show() Student");
    }
}
   

public class Anonymous_Class {
    public static void main(String[] args) {

        student d = new student()
        {
            public void show(){
                System.out.println("Teacher");  //Anonymous_Class - It has no name
            }
        };
        d.show();
    }
}
