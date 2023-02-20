interface Left{
    default void m1(){
        System.out.println("Left default");
    }
}

interface Right{

    default void m1(){
        System.out.println("Right Default");
    }
}

public class DefaultExa implements Left,Right{

    public static void main(String[] args) {
        DefaultExa d = new DefaultExa();
        d.m1();
    }

    @Override
    public void m1() {
        Right.super.m1();
    }
}
