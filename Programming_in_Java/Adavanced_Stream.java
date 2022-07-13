
//Stream Concept TEE Exam one question compulsory!!!!!




//In SET


// import java.util.*;
// import java.util.stream.Collectors;
// class Product
// {
//     int no;
//     String name;
//     float price;
//     public Product(int no, String name, float price)
//     {
//         this.no=no;
//         this.name=name;
//         this.price=price;
//     }
// }
// public class Adavanced_Stream
// {
//     public static void main(String[] args)
//     {
//         List<Product> list= new ArrayList<>();
//         list.add(new Product(1, "Lava",250f));
//         list.add(new Product(2, "Redme",150f));
//         list.add(new Product(3, "Samsung",350f));
//         list.add(new Product(4, "Apple",450f));
//         Set<String> set1= list.stream().filter(i->i.price>250).map(p->p.name)
//                             .collect(Collectors.toSet());
//         System.out.println(set1);
// //      double total= list.stream().collect(Collectors.summingDouble(p->p.price));
// //      System.out.println(total);
//     }
// }







//In Map with values

import java.util.*;
import java.util.stream.Collectors;
class Product
{
    int no;
    String name;
    float price;
    public Product(int no, String name, float price)
    {
        this.no=no;
        this.name=name;
        this.price=price;
    }
}
public class Adavanced_Stream
{
    public static void main(String[] args)
    {
        List<Product> list= new ArrayList<>();
        list.add(new Product(1, "Rudra",580f));
        list.add(new Product(2, "Rohan",230f));
        list.add(new Product(3, "Rahul",450f));
        list.add(new Product(4, "Ramesh",435f));
        Map<Integer,String> Map1= list.stream().filter(i->i.price>250)
                            .collect(Collectors.toMap(p->p.no,p->p.name));
        System.out.println(Map1);
//      double total= list.stream().collect(Collectors.summingDouble(p->p.price));
//      System.out.println(total);
    }
}











//Count function in stream



// import java.util.*;
// import java.util.stream.Collectors;
// class Product
// {
//     int no;
//     String name;
//     float price;
//     public Product(int no, String name, float price)
//     {
//         this.no=no;
//         this.name=name;
//         this.price=price;
//     }
// }
// public class Adavanced_Stream
// {
//     public static void main(String[] args)
//     {
//         List<Product> list= new ArrayList<>();
//         list.add(new Product(1, "Lava",250f));
//         list.add(new Product(2, "Redme",150f));
//         list.add(new Product(3, "Samsung",350f));
//         list.add(new Product(4, "Apple",450f));
//         long count = list.stream().filter(i->i.price>250).count(); //error if not used long
//         System.out.println(count);
// //      double total= list.stream().collect(Collectors.summingDouble(p->p.price));
// //      System.out.println(total);
//     }
// }








//getting name price no ----->>> method referencing   ----> Errorrrrr!!!! in this compiler

// import java.util.*;
// import java.util.stream.Collectors;
// class Product
// {
//     int no;
//     String name;
//     float price;
//     public Product(int no, String name, float price)
//     {
//         this.no=no;
//         this.name=name;
//         this.price=price;
//     }
//     public int getNo(){
//         return no;
//     }
//     public String getName(){
//         return name;
//     }
//     public float getPrice(){
//         return price;
//     }
// }
// public class Adavanced_Stream
// {
//     public static void main(String[] args)
//     {
//         List<Product> list= new ArrayList<>();
//         list.add(new Product(1, "Lava",250f));
//         list.add(new Product(2, "Redme",150f));
//         list.add(new Product(3, "Samsung",350f));
//         list.add(new Product(4, "Apple",450f));
//         List<String> list1= list.stream().filter(i->i.price>250).map(Product:: getName).collect(Collectors.toList());
//         System.out.println(list1);
//     }
// }








//Min MAX

// import java.util.*;
// // import java.util.stream.Collectors;
// class Product
// {
//     int no;
//     String name;
//     float price;
//     public Product(int no, String name, float price)
//     {
//         this.no=no;
//         this.name=name;
//         this.price=price;
//     }
//     public int getNo(){
//         return no;
//     }
//     public String getName(){
//         return name;
//     }
//     public float getPrice(){
//         return price;
//     }
// }
// public class Adavanced_Stream
// {
//     public static void main(String[] args)
//     {
//         List<Product> list= new ArrayList<>();
//         list.add(new Product(1, "Lava",250f));
//         list.add(new Product(2, "Redme",150f));
//         list.add(new Product(3, "Samsung",350f));
//         list.add(new Product(4, "Apple",450f));
//         Product p = list.stream().max((product1, product2)->product1.price>product2.price ? 1: -1).get();
//         System.out.println(p.price);

//         Product p1 = list.stream().min((product1, product2)->product1.price>product2.price ? 1: -1).get();
//         System.out.println(p1.price);
//     }
// }

