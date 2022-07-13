
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
 public class Stream3
 {
 public static void main(String[] args)
 {
 List<Product> list= new ArrayList<>();
 list.add(new Product(1, "Lava",250f));
 list.add(new Product(2, "Redme",150f));
 list.add(new Product(3, "Samsung",350f));
 list.add(new Product(4, "Apple",450f));
 //List<String> list1= list.stream().filter(i->i.price>250).map(p->p.name).collect(Collectors.toList());
 //System.out.println(list1);
 
 double total= list.stream().collect(Collectors.summingDouble(p->p.price));
 System.out.println(total);
 
 }
 }
