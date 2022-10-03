package multingthreading.Bank;

import java.util.Scanner;

public class BankTransaction {
    int totalAmount = 00;

    void withdrawMoney(int amount){
        totalAmount = totalAmount - amount;

    }

    void depositMoney(int amount) {
        totalAmount = totalAmount-amount;

    }
}

class UserOne extends Thread {
    int amt;
    BankTransaction bankTransaction;

    UserOne(BankTransaction bankTransaction, int amt) {
        this.bankTransaction = bankTransaction;
        this.amt = amt;
    }

    @Override
    public void run() {


    }
}

class UserTwo extends Thread {
    int amt;
    BankTransaction bankTransaction;

    UserTwo(BankTransaction bankTransaction, int amt) {
        this.bankTransaction = bankTransaction;
    }

    @Override
    public void run() {

    }
}

class TransactionImpl {
    public static void main(String[] args) throws InterruptedException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter WithDrawl Amount");
        int withdraw = sc.nextInt();
        System.out.println("Enter Deposit Amount");
        int deposite = sc.nextInt();

        BankTransaction bankTransaction = new BankTransaction();
        UserOne t1 = new UserOne(bankTransaction, withdraw);
        t1.start();
        t1.join();
        UserTwo t2 = new UserTwo(bankTransaction,deposite);

        t2.start();
    }
}