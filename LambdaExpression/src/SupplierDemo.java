import java.util.function.Predicate;
import java.util.function.Supplier;

public class SupplierDemo {

    public static void main(String[] args) {

        Supplier<String> r = () ->{
          return "Hello Everyone";
        };

        System.out.println(r.get());



    }
}
