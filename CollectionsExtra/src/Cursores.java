import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.*;

import static java.util.Arrays.*;

public class Cursores {

    public static void main(String[] args) {

        Integer[] a = {10,45,99,29,50};
       ArrayList<Integer> l = new ArrayList<>(Arrays.asList(a));
        l.set(1,9);
        System.out.println(l);

        //ListIterator

        ListIterator litr = l.listIterator();

        while(litr.hasNext())
        {
            Integer n = (Integer) litr.next();

            if(n==Integer.valueOf(10) ){
                litr.remove();
            }
            else if(n == Integer.valueOf(29)){
                litr.add(555);
            }
            else if(n == Integer.valueOf(99)){
                litr.set(999);
            }
        }
        System.out.println("==============hasPrevious============");
        while(litr.hasPrevious()){
            System.out.print((Integer)litr.previous()+":"+ litr.previousIndex()+" ");
        }
        System.out.println();
        System.out.println("========================================");

        System.out.println(l);

        HashSet hashSet = new HashSet(Arrays.asList(a));
        Set<HashSet> set = new HashSet<>(hashSet);

        Vector v = new Vector();

        for(int i=1;i<=10;i++){
            v.addElement(i);
        }

        System.out.println(v);
        Enumeration e = v.elements();

        System.out.println(e.getClass().getName());

        while(e.hasMoreElements()){
            Integer I = (Integer) e.nextElement();
            System.out.print(I+" ");
        }

        //Iterator

        Iterator itr = v.iterator();
        System.out.println();
        while(itr.hasNext()){
            Integer i = (Integer) itr.next();

            if(i%2==0){

                System.out.print(i+" ");
            }
            else{

                itr.remove();
            }
        }

        System.out.println();
        System.out.println(v);






    }
}
