package colletion;

import java.util.PriorityQueue;

public class PriorityStudentDemo {
    public static void main(String[] args) {
        PriorityQueue<Stud> queue = new PriorityQueue<>();
       queue.add(new Stud());
       queue.add(new Stud());
    }

}

class Stud{
    private  String Name;
    private  Double cgpa;

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public Double getCgpa() {
        return cgpa;
    }

    public void setCgpa(Double cgpa) {
        this.cgpa = cgpa;
    }


}