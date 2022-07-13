import java.util.*;  

public class De_que
{
  public static void main(String[] args) {
    Deque dq = new ArrayDeque<>(); //Using the non-generic Deque
    
    // add() method is used to add elements in the ArrayList at the extends
    dq.add(1);
    dq.add(2);
    dq.add("Shyam");
    dq.add("Rahul");
    dq.add("Rudra");
    dq.add("DAA");
    dq.add("Script");//Non generic and hence it can be heterogeneous
    
    //Printing Deque
    System.out.println(dq);
    System.out.println();
    
    
    //Collections have Iterators. 
    //Declaring Iterator
    System.out.println("Printing Entire Deque:");
    Iterator it = dq.iterator();
    //hasNext method checks existence of next element and next method access the next element of iterator
    while(it.hasNext()) System.out.println(it.next());
    System.out.println();
    
    //offerFirst enters element in the front of queue and polllast pops the last element from queue
    dq.offerFirst("Hello World");
    System.out.println("Printing Entire Deque after offerFirst: "+ dq);
    System.out.println("Printing last elemnt using polllast: "+ dq.pollLast());
    System.out.println("Printing Entire Deque after polllastt: "+ dq);
    System.out.println();
    
    //poll()
        //Retrieves and removes the head of this queue, or returns null if this queue is empty.
        System.out.println("Initial Queue: " + dq);
        System.out.println("The head of dequeue is: "+ dq.poll());
        System.out.println("Printing Entire Deque after poll operation: "+ dq);
        System.out.println();
        
        //element()
        //Retrieves, but does not remove, the head of this queue. This method differs from peek only in that it throws an exception if this queue is empty.
        System.out.println("Initial Queue: " + dq);
        System.out.println("The head of dequeue is using element: "+ dq.element());
        System.out.println();
        
        //peek()
        //Retrieves, but does not remove, the head of this queue, or returns null if this queue is empty.
        System.out.println("Initial Queue: " + dq);
        System.out.println("The head of dequeue is using peek: "+ dq.peek());
        System.out.println();
        
        //remove()
        //Retrieves and removes the head of this queue
        System.out.println("Initial Queue: " + dq);
        System.out.println("The head of dequeue is: "+ dq.remove());
        System.out.println("Printing Entire Deque after remove operation: "+ dq);
        System.out.println();
        
        //getFirst()
        //Retrieves, but does not remove, the first element of this deque. This method differs from peekFirst only in that it throws an exception if this deque is empty.
        System.out.println("Initial Queue: " + dq);
        System.out.println("The first element of dequeue is using getFirst: "+ dq.getFirst());
        System.out.println("The last element of dequeue is using getLast: "+ dq.getLast());
        System.out.println();
        
        //peekFirst()
        //Retrieves, but does not remove, the first element of this deque, or returns null if this deque is empty.
        System.out.println("Initial Queue: " + dq);
        System.out.println("The first element of dequeue is using peekFirst: "+ dq.peekFirst());
        System.out.println("The last element of dequeue is using peekLast: "+ dq.peekLast());
        System.out.println();
        
        //removeFirstOccurrence(Object o)
        //Removes the first occurrence of the specified element from this deque. If the deque does not contain the element, it is unchanged. 
        dq.add("Rudra");
        dq.add("Raj");
        dq.add("Kumar");
        dq.add("Dubey");
        dq.add("Rudra");
        System.out.println("Initial Queue: " + dq);
        dq.removeFirstOccurrence("Rudra");
        System.out.println("After removing first Occurence: "+ dq);
        dq.removeLastOccurrence("Rudra");
        System.out.println("After removing last Occurence: "+ dq);
  }
}

