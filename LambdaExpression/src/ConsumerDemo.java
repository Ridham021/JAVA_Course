import java.util.function.Consumer;

public class ConsumerDemo {

    public static void main(String[] args) {

        Consumer<String> c = s -> {
            System.out.println(s);
            System.out.println("My name is Ridham");
        };


        c.accept("Hello");



    }
}
