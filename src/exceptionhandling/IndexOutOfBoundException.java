package exceptionhandling;
public class IndexOutOfBoundException {

    public static void main(String[] args) {
        String [] subject = {"math","science","Marathi","History","English"};
        try{
        for(int i=0; i<=subject.length;i++) {
            System.out.println(subject[i] + "");
        }
        }catch (ArrayIndexOutOfBoundsException a){
            System.out.println("");
        }
    }
}
