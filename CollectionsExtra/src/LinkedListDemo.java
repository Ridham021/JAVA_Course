import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {
    public static void main(String[] args) {

        List<int[]> a =  Arrays.asList(new int[]{40, 10, 50, 60});
        LinkedList ll = new LinkedList();
        ll.add(10);
        ll.add(40);
        ll.addAll(ll);
        System.out.println(ll.toString());
        ll.set(0,100);
        ll.add(0,"Ridham");
        System.out.println(ll.toString());
        ll.addFirst("AAA");
        ll.removeLast();
        System.out.println(ll.toString());
    }
}
