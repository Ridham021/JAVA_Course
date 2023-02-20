import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class StreamDemo {

    public static void main(String[] args) {

        Integer[] a = {10,15,20,25,30,35};
        ArrayList<Integer> l = new ArrayList<>(Arrays.asList(a));

        List<Integer> l1 = l.stream().filter(i -> i%2==0).collect(Collectors.toList());
        System.out.println(l1);

        //Perfrom some operation on every element of List & store it in new list

        List<Integer> doubleList = l.stream().map(i -> i*2).collect(Collectors.toList());
        System.out.println("Doubled list :- "+doubleList);

            }
}
