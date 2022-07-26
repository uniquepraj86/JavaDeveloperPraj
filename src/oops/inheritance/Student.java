package oops.inheritance;

/**
 * Multilevel
 */
public class Student {
    String name="xyz";
    int rno=1;
    String div ="B";
}
class PhysicsMarks extends Student{
    double marks = 89;
}
class ChemistryMarks extends Student{
    double marks = 72;
}
class MathsMarks extends Student{
    static double marks = 68;
}


class StudentImpl{
    public static void main(String[] args) {
        MathsMarks mathsMarks = new MathsMarks();
        ChemistryMarks chemistryMarks = new ChemistryMarks();
        PhysicsMarks physicsMarks = new PhysicsMarks();
        double total= MathsMarks.marks+chemistryMarks.marks+physicsMarks.marks;
        double percentages = (total/300)*100;
        System.out.println(".........Student Details.......");
        System.out.println("Roll No."+ mathsMarks.rno);
        System.out.println("Name."+mathsMarks.name);
        System.out.println("Div."+mathsMarks.div);
        System.out.println("percentage."+percentages);
        }

    }

