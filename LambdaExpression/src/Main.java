public class Main {
    public static void main(String[] args) {

      Test t1 = new Test();
      t1.m2();

    }
}

interface Interf{
    void m1();
}

class Test{

    int x=10;
    public void m2(){
        int y=20;

        Interf i =() -> {
            System.out.println(x);
            System.out.println(y);


        };

        i.m1();


    }
}