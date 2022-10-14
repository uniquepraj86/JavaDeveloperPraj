package innerclass;

import java.sql.SQLOutput;

public class AnonymousInterface {
    public static void main(String[] args) {
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("Thread Started");
            }
        };
        Thread thread = new Thread(runnable);
        thread.start();
    }
}
/**
 *
 *
 *
 *
 *
 *
 *
 */