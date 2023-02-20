import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.RandomAccess;

public class ArrayListDemo {
    static ArrayList l = new ArrayList();

    public ArrayListDemo(ArrayList l) {
        this.l = l;
    }

    public static void main(String[] args) {


        l.add(10);
        l.add(20);
        l.add("Ridham");
        l.remove(l.indexOf(10));
        System.out.println(l.toString());
        l.add(2,"hello");
        System.out.println(l.toString());

        System.out.println("==============================");

        LinkedList llist = new LinkedList();
        System.out.println("ArrayList :"+l instanceof Serializable);
        System.out.println(llist instanceof Cloneable);
        System.out.println(l instanceof RandomAccess);
        System.out.println(llist instanceof RandomAccess);



    }

    @Override
    public String toString() {
        return "ArrayListDemo{" +
                "l=" + l +
                '}';
    }
}
