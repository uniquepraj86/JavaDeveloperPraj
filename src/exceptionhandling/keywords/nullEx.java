package exceptionhandling.keywords;

public class nullEx {
    public static void main(String[] args) {
        try{
            String name ="NULL";
            System.out.println(name.toLowerCase());

           int a[]={1,2,3,4,5};
            System.out.println(a[7]);

        }catch(Exception e)
        {
            System.out.println(e.getMessage());
            System.out.println("str is Null");

        }
    }
}
