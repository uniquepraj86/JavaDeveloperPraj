package multingthreading;

public class SleepMethodDemo extends Thread {

    @Override
    public void run() {
        System.out.println("in run method");
        for (int i = 1; i <= 10; i++) {
            try {
                System.out.println(Thread.currentThread().getName() + " " + i);
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);

            }

        }
    }
}

class SleepDemoImpl {
    public static void main(String[] args) {
        SleepMethodDemo t1 = new SleepMethodDemo();
        System.out.println("T1");
        SleepMethodDemo t2 = new SleepMethodDemo();
        System.out.println("T2");
        t1.start();
        t2.start();
    }
}


