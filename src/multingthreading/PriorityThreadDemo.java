package multingthreading;

public class PriorityThreadDemo extends Thread{
    @Override
    public void run() {

    }
}
class PriorityThreadDemoImpl{
    public static void main(String[] args) {
         PriorityThreadDemo t1 =new PriorityThreadDemo();
        PriorityThreadDemo t2 =new PriorityThreadDemo();
        PriorityThreadDemo t3 =new PriorityThreadDemo();
//        t1.start();
//        t2.start();
//        t3.start();
        System.out.println("T1"+t1.getPriority());
        System.out.println("T2"+t2.getPriority());
        System.out.println("T3"+t3.getPriority());

        Thread.currentThread().setPriority(7);
        t1.setPriority(4);
        t2.setPriority(Thread.MIN_PRIORITY);
        t3.setPriority(Thread.MAX_PRIORITY);
        t1.start();
        t2.start();
        t3.start();
        System.out.println("T1"+t1.getPriority());
        System.out.println("T2"+t2.getPriority());
        System.out.println("T3"+t3.getPriority());
        System.out.println("main"+Thread.currentThread().getPriority());
    }
}