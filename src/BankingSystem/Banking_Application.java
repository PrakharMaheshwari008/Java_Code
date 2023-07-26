package BankingSystem;

import java.util.Scanner;
import java.util.concurrent.BrokenBarrierException;
import java.util.prefs.BackingStoreException;

public class Banking_Application {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount("Prakhar Maheshwari",1234555);
        bankAccount.show();
    }
}
class BankAccount{
    int balance;
    int previousTransaction;
    String customerName;
    int customerId;
    BankAccount(String customerName, int customerId){
        this.customerName = customerName;
        this.customerId = customerId;
    }
    void deposit(int amount){
        if(amount != 0){
            balance+=amount;
            previousTransaction = balance;
        }
    }
    void withdrawal(int amount){
        if(amount != 0){
            balance-=amount;
            previousTransaction=amount;
        }
    }
    void getprevioustransaction(){
        if(previousTransaction > 0){
            System.out.println("Deposited :- "+previousTransaction);
        }
        else if (previousTransaction < 0){
            System.out.println("Withdrawal"+ Math.abs(previousTransaction));
        }
        else{
            System.out.println("No transaction Occured");
        }
    }
    void show(){
        char option = '\0';
        Scanner sc = new Scanner(System.in);
        System.out.println("WelCome "+ customerName);
        System.out.println("Your cumtomer" + customerId);
        System.out.println();
        System.out.println("A. Check balance");
        System.out.println("B. Deposit");
        System.out.println("C. Withdrawal");
        System.out.println("D. previous transaction");
        System.out.println("E. Exit");
        do {
            System.out.println("*************************************************************");
            System.out.println("Enter the Option");
            System.out.println("*************************************************************");
            option = sc.next().charAt(0);
            System.out.println();
            switch (option) {
                case 'A':
                    System.out.println("*************************************************************");
                    System.out.println("Balance = " + balance);
                    System.out.println("*************************************************************");
                    System.out.println();
                    break;
                case 'B':
                    System.out.println("*************************************************************");
                    System.out.println("Enter the amount to deposit");
                    System.out.println("*************************************************************");
                   int amount = sc.nextInt();
                   deposit(amount);
                    System.out.println();
                    break;
                case 'C':
                    System.out.println("*************************************************************");
                    System.out.println("Enter an amount to withdraw");
                    System.out.println("*************************************************************");
                    int amount2 = sc.nextInt();
                    withdrawal(amount2);
                    System.out.println();
                    break;
                case 'D':
                    System.out.println("*************************************************************");
                    getprevioustransaction();
                    System.out.println("*************************************************************");
                    System.out.println();
                    break;
                case 'E':
                    System.out.println("*************************************************************");
                    break;
                default:
                    System.out.println("Invalid Option !! please E/nter Again");
                    break;
            }

        }while (option != 'E');
        System.out.println("Thank you using our service");
    }
}