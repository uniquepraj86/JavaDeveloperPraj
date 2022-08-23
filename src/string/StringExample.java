package string;

public class StringExample {
    public static void main(String[] args) {
        String str = "my name is prajakta arote";
        System.out.println("Upper Case: "+str.toUpperCase());
        System.out.println("Lower Case: "+str.toLowerCase());
        System.out.println("Char At: "+str.charAt(3));
        System.out.println("Concat: "+str.concat(" Pvt. Ltd."));
        System.out.println("Replace: "+str.replace("is","at"));
        System.out.println("Replace All "+str.replaceAll("in","at"));
        System.out.println("Contains "+str.contains("brings"));
        System.out.println(str);


    }
}
