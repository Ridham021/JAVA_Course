interface Square{

    void printNumber(int num1);
}

public class SquareDemo  {

    public static void main(String[] args) {
        Square s = n -> System.out.println("Squre is : "+n*n);
        s.printNumber(12);
    }



}
