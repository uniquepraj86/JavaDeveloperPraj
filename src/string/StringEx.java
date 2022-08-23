package string;

public class StringEx {
    public static void main(String[] args) {


        String s1 = "Nashik";
        String s2 = "mumbai";
        String s3 = new String("pune");
        if( s1==s2){
            System.out.println("true");
        }else{
            System.out.println("false");
        }
        if(s1==s3){
            System.out.println("true");
        }else {
            System.out.println("false");
        }
        if(s1.equals(s2)){
            System.out.println("true");
        }else{
            System.out.println("false");
        }
        System.out.println(s1.compareTo(s2));
        System.out.println(s1.equalsIgnoreCase(s2));
    }
}
