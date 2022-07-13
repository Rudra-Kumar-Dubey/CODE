import java.util.*;
public class Map2 {
    public static void main(String[] args) {
        Map map = new HashMap();
        map.put(1,"Ram");
        map.put(2,"Rohan");
        map.put(3,"Shyam");
        map.put(4,"Lyam");
        map.put(4,"kate"); // overwrite key values is always unique
        map.put(5,"kate"); // value maybe same
        Set<Integer> Keys = map.keySet();
        for(Integer Key : Keys){
            System.out.println(Key + " " + map.get(Key));
        }
    }
}
