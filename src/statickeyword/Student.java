package statickeyword;

public class Student {
      int rno;
      String name;
      static String schoolName;
      void display()
      {
          System.out.println(rno+":"+name+":"+schoolName);
      }
}
class StudentImpl
{
      public static void main(String[] args) {

            Student s1=new Student();
            s1.rno =1;
            s1.name="Praj";
            Student.schoolName="mj";

            Student s2=new Student();
            s2.rno =2;
            s2.name="Ruth";
            Student.schoolName="pj";

            Student s3=new Student();
            s3.rno =3;
            s3.name="Meera";
            Student.schoolName="JJ";


            s1.display();
            s2.display();
            s3.display();
      }

      }

