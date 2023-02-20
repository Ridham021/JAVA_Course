import java.util.Scanner;
import java.util.TreeMap;

public class SynchronizeExample {
    private int bal;
    public SynchronizeExample(int bal){
        this.bal = bal;
    }

    public boolean isSufficientBalance(int w){
         if(bal>w){
             return true;
         }
         else{
             return false;

         }
    }

    public void withdraw(int amt){
        bal = bal-amt;
        System.out.println("withdrawl money is "+amt);
        System.out.println("Current balance is : "+bal);
    }
    public static void main(String[] args) {

        SynchronizeExample a1 = new SynchronizeExample(1000);
        Customer c1= new Customer(a1,"Ridham"),c2= new Customer(a1,"Abhi");
        Thread t1 =   new Thread(c1);

        Thread  t2 = new Thread(c2);
        t1.start();
        t2.start();
    }
}

class Customer implements Runnable{
    private SynchronizeExample account;
    String name;

    public Customer(SynchronizeExample account,String name){
        this.account=account;
        this.name = name;
    }

    public void run() {
        Scanner kb = new Scanner(System.in);
        System.out.println(name + " Enter amount you want to withdraw : ");
        int amt = kb.nextInt();


        synchronized (account) {
            if (account.isSufficientBalance(amt)) {
                account.withdraw(amt);
            } else {
                System.out.println(name + " Insufficient balance");
            }
        }
    }

}

