import java.util.Stack;

public class StackDemo {

    public static void main(String[] args) {

        Stack s = new Stack();
        s.push("A");
        s.push("B");
        s.push("C");
        s.push("D");
        System.out.println(s.toString());
        System.out.println(s.pop());
        System.out.println(s.peek());
        System.out.println(s.toString());
        System.out.println(s.search("B"));




    }
}
