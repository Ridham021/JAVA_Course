import java.util.HashSet;
import java.util.LinkedHashSet;

public class HashSetDemo {

    public static void main(String[] args) {

        HashSet h = new HashSet();

        h.add("C");
        h.add("D");
        h.add("E");
        h.add(null);
        h.add("F");
        h.add("A");
        h.add("A");
        h.add("B");


        //LinkedHashSet

        LinkedHashSet lhs = new LinkedHashSet();
        lhs.add("C");
        lhs.add("D");
        lhs.add("E");
        lhs.add(null);
        lhs.add("F");
        lhs.add("A");
        lhs.add("A");
        lhs.add("B");


        System.out.println(h);
        System.out.println("LinkedHashSet : "+lhs); 
    }
}
