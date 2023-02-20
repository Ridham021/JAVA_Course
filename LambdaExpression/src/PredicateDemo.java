import java.util.function.Predicate;

public class PredicateDemo {

    public static void main(String[] args) {
        Predicate<Integer> p = a ->{
            return a>18;
        };
        System.out.println(p.test(100));

    }
}
