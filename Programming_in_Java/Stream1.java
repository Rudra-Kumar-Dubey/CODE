import java.util.*;



public class Stream1
{
public static void main(String[] args)
{
List<Integer> list = new ArrayList<>();
list.add(45);
list.add(35);
list.add(55);
list.add(25);
list.add(65);

list.stream().filter(i->i>35).forEach(l->{System.out.println(l);});


//list.forEach(i->System.out.println(i));

}
}

