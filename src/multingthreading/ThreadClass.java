package multingthreading;

public class ThreadClass  extends Thread{

        @Override
        public void run() {
            System.out.println("Thread in Running State");
        }

}
class ThreadClassImpl{
    public static void main(String[] args) {
        ThreadClass t1 =new ThreadClass();
        t1.start();

        }
    }
