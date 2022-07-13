import java.util.*;  
public class TreeSet
{
  public static void main(String[] args) {
    TreeSet<String> ts = new TreeSet<>();
    
    ts.add("Jam");
    ts.add("Cake");
    ts.add("Time");
    ts.add("Chips");
    ts.add("Ribon");
    System.out.println(ts);
    System.out.println();
    
    //Traversing elements  
        Iterator<String> itr=ts.iterator();  
        System.out.println("Iterating through entire TreeSet:");
        while(itr.hasNext()){  
           System.out.println(itr.next());  
        }
        System.out.println();
        
        System.out.println("A TreeSet automatically sorts the elements supplied in Ascending order");
        TreeSet<Integer> ts1 = new TreeSet<>();
        ts1.add(11);  
        ts1.add(45);  
        ts1.add(67);  
        ts1.add(24);
        System.out.println("Original TreeSet: "+ ts1);
        System.out.println("Lowest Value: "+ts1.pollFirst());  
        System.out.println("Highest Value: "+ts1.pollLast()); 
        System.out.println();
        
        //Navigable set operations
        TreeSet<String> set=new TreeSet<String>();  
        set.add("a");  
        set.add("b");  
        set.add("c");  
        set.add("d");  
        set.add("e");  
        System.out.println("Initial Set: "+set);  
        System.out.println("Reverse Set: "+set.descendingSet());  
        System.out.println("Head Set: "+set.headSet("c", true));  
        System.out.println("SubSet: "+set.subSet("a", false, "e", true));  
        System.out.println("TailSet: "+set.tailSet("c", false)); 
        System.out.println();
        //Sorted Set operations
        TreeSet<String> set1 =new TreeSet<String>();  
        set1.add("a");  
        set1.add("b");  
        set1.add("c");  
        set1.add("d"); 
        set1.add("e");  
        System.out.println("Intial Set: "+set1);  
        System.out.println("Head Set: "+set1.headSet("c"));  
        System.out.println("SubSet: "+set1.subSet("a", "e"));  
        System.out.println("TailSet: "+set1.tailSet("c"));  
        System.out.println();
        
        System.out.println("Size of TreeSet: "+ set1.size());
        
    
  }
}