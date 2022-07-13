import java.util.*;
public class Deque1 {
    public static void main(String[] args) {
        Deque<String> dq = new ArrayDeque<>();
        dq.add("Abi");
        dq.add("anu");
        dq.addFirst("Dog");
        dq.addLast("cat");
        dq.push("push");
        // dq.removeFirst();
        // dq.removeLast();
        System.out.println(dq.pop());
        System.out.println(dq.peek());

        for(String s : dq){
            System.out.println(s);
        }
    }
}
