
//using Runnable Interface
//class A implements Runnable{
//
//    public void run(){
//        for(int i=0;i<10;i++){
//            System.out.println("Thred A:"+(i+1));
//        }
//    }
//}
//
//class B implements Runnable{
//    public void run(){
//        for(int i=0;i<10;i++){
//            System.out.println("Thred B:"+(i+1));
//        }
//    }
//}

class A extends Thread{
    public void run(){
        for(int i=0;i<10;i++){
            System.out.println("Thread A : "+(i+1));
        }
    }
}

class B extends Thread{
    public void run(){
        for(int i=0;i<10;i++){
            System.out.println("Thread B : "+(i+1));
        }
    }
}


//using Thread Class
public class Main {
    public static void main(String[] args) {

//       Thread t1= new Thread(new A());
//       Thread t2 = new Thread(new B());

        A t1 = new A();
        B t2 = new B();
       t1.start();
       t2.start();
    }
}

