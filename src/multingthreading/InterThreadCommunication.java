package multingthreading;


class BankD {
    int totalAmount = 0;

    void deposit(int amount) {
        totalAmount += amount;
        System.out.println("Total Amount" + totalAmount);
    }

    void withdrawMoney(int amount) throws InterruptedException {
        if (amount > totalAmount) {
            System.out.println("Insufficient Balance");
            wait();
        }
        totalAmount -= amount;
        System.out.println("Remaining Amount" + totalAmount);
    }
}


public class InterThreadCommunication {
    public static void main(String[] args) throws InterruptedException {

        BankD bankD = new BankD();
        new Thread() {
            @Override
            public void run() {
                try {
                    bankD.withdrawMoney(100);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }.start();
        bankD.deposit(100);
//        bankD.withdrawMoney(50);
    }
}

