package innerclass;

public interface StudentService {
    void getStudent();
    void addStudent(int rno,String name);
}
class StudentInterfaceImpl{
    public static void main(String[] args) {

        StudentService studentService = new StudentService() {
            int rno = 0;
            String name = null;
            @Override
            public void getStudent() {

            }

            @Override
            public void addStudent(int rno, String name) {
                this.rno =rno;
                this.name=name;

            }

        };
    }
}