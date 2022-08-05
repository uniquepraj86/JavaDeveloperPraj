package assignments;

import java.util.Scanner;

public class Emp {
    private int id;
    private String name;
    private String dept;
    private double salary;

    public Emp(int id,String name, String dept,Float salary)
    {
        this.id = id;
       this. name=name;
       this. dept=dept;
       this. salary  = salary;
    }
   public void acceptE()
   {
       Scanner s= new Scanner(System.in);
       System.out.println("Enter id");
       id=s.nextInt();
       System.out.println("Enter name:");
       name=s.next();
       System.out.println("Enter dept:");
       dept=s.next();
       System.out.println("Enter salary:");
      double salary=s.nextDouble();
   }
   public void displayE()
   {
       System.out.println("Emp id:"+id);
       System.out.println("Emp name:"+name);
       System.out.println("Emp dept:"+dept);
       System.out.println("Emp salary:"+salary);
   }
}
class Maneger extends Emp
{
private double bonus;

    public Maneger(int eid, String name, String dept, Float salary) {
        super(eid, name, dept, salary);
    }



}
