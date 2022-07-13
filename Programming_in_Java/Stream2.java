import java.util.*;
import java.util.stream.Collectors;
public class Stream2
{
public static void main(String[] args)
{
List<Integer> list = new ArrayList<>();
list.add(45);
list.add(35);
list.add(55);
list.add(25);
list.add(65);

List<Integer> list1= list.stream().filter(i->i>35).collect(Collectors.toList());


list1.forEach(l->{System.out.println(l);});


//list.forEach(i->System.out.println(i));

}
}