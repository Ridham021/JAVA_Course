import java.util.function.Function;

public class FunctionDemo {
    public static void main(String[] args) {
        Function<Integer , Double> f = a -> a/2.0;

        Function<Integer , Boolean> age = x -> {
            if(x>13 && x<=19){
                return true;
            }
            else {
                return false;
            }
        };

        System.out.println(f.apply(15));

        System.out.println("Teen or not : 15 -> "+age.apply(14));
    }
}
