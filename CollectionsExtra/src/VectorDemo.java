import java.util.Vector;

public class VectorDemo {

     static int i;

    public static void main(String[] args) {
        Vector v = new Vector<>(5,1);

        for( i=1;i<=5;i++)
        {

            v.addElement(Integer.valueOf(i));
        }
        System.out.println(v.capacity());
        v.addElement("Ridham");
        System.out.println(v.capacity());
        System.out.println(v.toString());
        System.out.println(v.size());
    }
}
