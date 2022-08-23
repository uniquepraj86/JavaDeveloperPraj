package string;

public class Person {

       private  int id  ;
       private String name;
       private int MobileNo;
       private String email;

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", MobileNo=" + MobileNo +
                ", email='" + email + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Person p = new Person();
        p.id = 1234;
        p.name = "praj";
        p.MobileNo = 9785643;
        p.email = "prajkta86@gmail.com";
        System.out.println(p.toString());


    }



}
