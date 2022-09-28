package multingthreading;

import java.util.Scanner;

class Table {
    synchronized void printTable(int no) {

        for (int i = 1; i <= 10; i++) {
            try {
                Thread.sleep(500);

            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(no * i);
        }
    }
}

class ThreadTableOne extends Thread{
    Table table;



    int no;
    ThreadTableOne (Table table,int no){
        this.table = table;
        this.no = no;
    }
    @Override
    public void run(){
       table.printTable(no);
    }
}

public class synchroniseMethodDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number");
        int no1 = sc.nextInt();
        System.out.println("Enter Second Number");
        int n02 = sc.nextInt();
        Table table  = new Table();
        ThreadTableOne t1 = new ThreadTableOne(table,no1);

        t1.start();

    }

}


