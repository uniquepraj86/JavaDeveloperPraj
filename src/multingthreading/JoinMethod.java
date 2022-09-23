package multingthreading;

public class JoinMethod extends Thread{
    @Override
    public void run(){
        try{
            Thread.sleep(1000L);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("in Method"+Thread.currentThread().getName());
    }
}

class  JoinMethodImpl{

    public static void main(String[] args) throws InterruptedException {
        System.out.println(Thread.currentThread().getName());
        JoinMethod t1 = new JoinMethod();
        JoinMethod t2 = new JoinMethod();
        JoinMethod t3 = new JoinMethod();
        t1.start();
        t1.join();
        t2.start();
        t2.join();
        t3.start();
        t3.join();

    }
}