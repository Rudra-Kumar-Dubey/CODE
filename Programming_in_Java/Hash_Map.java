import java.util.*;  
public class Hash_Map
{
  public static void main(String[] args) {
    HashMap<Integer,String> mp = new HashMap<>(); //Using the generic HashMap
    
    // add() method is used to add elements in the ArrayList at the extends
    mp.put(1,"Joseph");
    mp.put(2, "Chair");
    mp.put(3, "Plate");
    mp.put(4, "Scale");
    mp.put(5, "Copy");
    mp.put(6, "Tape");
    mp.put(7, "TV");
    
    //Printing Deque
    System.out.println(mp);
    System.out.println();
    
    
    System.out.println("Iterating Hashmap...");  
        for(Map.Entry m : mp.entrySet()){    
            System.out.println(m.getKey()+" "+ m.getValue());    
        }
        System.out.println();
        
        System.out.println("Entering Duplicate key");
        mp.put(1,"Meter"); //trying duplicate key
        System.out.println(mp);
        System.out.println();
        
        System.out.println("putIfAbsent method checks if element is present and if not puts it");
        System.out.println("Map before method: "+ mp);
        mp.putIfAbsent(8,"Cake");
        System.out.println("Map after putIfAbsent method: "+ mp);
        System.out.println();
        
        
        System.out.println("Initial list of elements: "+mp);  
        //key-based removal  
        mp.remove(6);  
        System.out.println("Updated list of elements after remove: "+mp);  
        //value-based removal  
        mp.remove("Scale");  
        System.out.println("Updated list of elements after value based removal: "+mp);  
        //key-value pair based removal  
        mp.remove(5, "Copy");  
        System.out.println("Updated list of elements after pair removal: "+mp); 
        System.out.println();
        
        
        System.out.println("Initial Map: "+ mp);
        mp.replace(1,"Rudra Dubey");
        System.out.println("Map after replacing: "+mp);
        System.out.println();
        
        System.out.println("Initial Map: "+ mp);
        mp.replaceAll((k,v)->"Raj");
        System.out.println("Map after replacing All values: "+mp);
        System.out.println();

	  System.out.println("Size of Map: "+ mp.size());
  }
}
