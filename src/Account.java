

public class Account {

    int balance;

    public Account(int balance) {
        this.balance = balance;
    }

    public synchronized void withdraw(int withdrawAmount) throws InterruptedException {
        System.out.println("Inside withdraw method");
        if(withdrawAmount>balance) {
            System.out.println("Thread is waiting...");
            wait();
        }
        System.out.println("Withdraw Success ..........");
        this.balance = this.balance - withdrawAmount;

    }

    public synchronized void deposit(int depositAmount) {
        System.out.println("Inside Deposit method");
        this.balance = this.balance+depositAmount;
        System.out.println("Notifying to other thread to execute");
        notify();
    }




}