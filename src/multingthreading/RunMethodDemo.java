package multingthreading;

public class RunMethodDemo extends Thread {
//   @Override
    public void run() {
        System.out.println("in run Method");
     for (int i=0;i<5;i++){
         try{
             Thread.sleep(1000L);
             System.out.println(Thread.currentThread().getName()+" "+i);
         } catch (InterruptedException e) {
             throw new RuntimeException(e);
         }
     }

    }


}

class RunMethodIMpl {
    public static void main(String[] args) {
        RunMethodDemo t1 = new RunMethodDemo();
//        t1.start();
         t1.run();
    }
}