import java.util.*;
public class Collections{
    
    public static void main(String[] args){
        Collection value = new ArrayList();
        value.add("Ram");
        value.add("Anu");
        value.add("Suvetha");

        Iterator it = value.iterator();

        while(it.hasNext()){
        System.out.println(it.next());
        }
    }
}