package multingthreading.Bank;

public class InsufficientBalance extends Exception{
    public InsufficientBalance(String msg){
        super(msg);
    }
}
