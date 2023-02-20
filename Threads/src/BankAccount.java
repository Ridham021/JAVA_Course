









//=======================Lecture Video===========================================//

//import java.util.concurrent.TimeUnit;
//import java.util.concurrent.locks.Lock;
//import java.util.concurrent.locks.ReentrantLock;
//
//public class BankAccount extends Thread {
//
//    private double balance;
//    private String accountNumber;
//    private Lock lock;
//
//    public BankAccount(double balance, String accountNumber) {
//        this.balance = balance;
//        this.accountNumber = accountNumber;
//        this.lock = new ReentrantLock();
//    }
//
//    //using synchronized method
//
////    public boolean deposit(double amount)
////    {
////        synchronized (this) {
////            balance += amount;
////            return true;
////        }
////    }
////
////    public boolean withdraw(double amount) {
////
////        synchronized (this) {
////            if (balance < amount) {
////                return false;
////            } else {
////                balance -= amount;
////                return true;
////            }
////        }
////    }
//
//    //using lock
//
////    public void deposit(double amount){
////        lock.lock();
////        try{
////            balance+=amount;
////        }
////        finally {
////            lock.unlock();
////        }
////
////    }
////
////    public void withdraw(double amount){
////        lock.lock();
////        try{
////            balance-=amount;
////        }
////        finally {
////            lock.unlock();
////        }
////    }
//
//    //usign trylock
//
//    public void deposit(double amount) {
//        boolean status = false;
//        try {
//            if(lock.tryLock(1000, TimeUnit.MILLISECONDS)) {
//                try {
//                    balance += amount;
//                    status = true;
//                    System.out.println(balance+" after deposit - "+Thread.currentThread().getName());
//
//                } finally {
//                    lock.unlock();
//                }
//            } else {
//                System.out.println("Could not get the lock");
//            }
//
//        } catch(InterruptedException e) {
//            // do something here
//        }
//        System.out.println("Transaction status : "+status);
//    }
//
//    public void withdraw(double amount) {
//        boolean status = false;
//        try {
//            if(lock.tryLock(1000, TimeUnit.MILLISECONDS)) {
//                try {
//                    balance -= amount;
//                    System.out.println(balance+" after withdraw - "+Thread.currentThread().getName());
//                } finally {
//                    lock.unlock();
//                }
//            } else {
//                System.out.println("Could not get the lock");
//            }
//
//        } catch(InterruptedException e) {
//            // do something here
//        }
//        System.out.println("Transaction status : "+status);
//    }
//
//
//    public String getAccountNumber() {
//        return accountNumber;
//    }
//
//    public void printAccountNumber(){
//        System.out.println("Account Number = "+accountNumber);
//    }
//
//
