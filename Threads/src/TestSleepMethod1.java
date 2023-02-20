public class TestSleepMethod1 extends Thread{
    public void run(){
        for(int i=1;i<5;i++){
            // the thread will sleep for the 500 milli seconds
            try{Thread.sleep(500);}catch(InterruptedException e){System.out.println(e);}
            System.out.println(i);
        }
        System.out.println("executed by : "+Thread.currentThread().getName());
    }
    public static void main(String args[]) throws InterruptedException {
        TestSleepMethod1 t1=new TestSleepMethod1();
        TestSleepMethod1 t2=new TestSleepMethod1();

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println("Main thread");
    }

}
