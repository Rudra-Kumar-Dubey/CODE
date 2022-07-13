import java.util.*;
public class Map3 {
    public static void main(String[] args) {
        Map<String,String> map = new HashMap();
        map.put("Head","Ram");
        map.put("Lead","Abi");
        map.put("Assistant","Rai"); 
        Set<String> Keys = map.keySet();
        for(String Key : Keys){
            System.out.println(Key + " " + map.get(Key));
        }
    }
}
