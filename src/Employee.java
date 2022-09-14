import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
// object representation
public class Employee {

    private  String name;
    private  String empCode;
    private Integer age;
    private Integer salary;

    public String getName() {
        return name;
    }

    public String getEmpCode() {
        return empCode;
    }

    public Integer getAge() {
        return age;
    }

    public Integer getSalary() {
        return salary;
    }


    public Employee(String name, String empCode, Integer age, Integer salary) {
        this.name = name;
        this.empCode = empCode;
        this.age = age;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", empCode='" + empCode + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }
}

class EmpNameComparator implements Comparator<Employee> {
    @Override
    public int compare(Employee e1, Employee e2) {

        return e1.getName().compareTo(e2.getName());
    }
}

class EmpAgeComparator implements Comparator<Employee>{
    @Override
    public int compare(Employee a1, Employee a2) {
        return a1.getAge().compareTo(a2.getAge());
    }
}

class EmpCodeComparator implements Comparator<Employee>{
    @Override
    public int compare(Employee c1, Employee c2) {
        return c1.getEmpCode().compareTo(c2.getEmpCode());
    }
}

class EmpSalaryComparator implements Comparator<Employee>{
    @Override
    public int compare(Employee s1, Employee s2) {
        return s1.getSalary().compareTo(s2.getSalary());
    }
}


class EmpComparatorImpl{
    public static void main(String[] args) {
        Employee e1 = new Employee("Prajakta", "EMP-001", 23, 1100000);
        Employee e2 = new Employee("Pranali", "EMP-002", 24, 1300000);
        Employee e3 = new Employee("Janhavi", "EMP-003", 18, 1200000);
        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(e1);
        employees.add(e2);
        employees.add(e3);
        Collections.sort(employees, new EmpAgeComparator());
        System.out.println("By Age");
        for(Employee e: employees){
            System.out.println(e.toString());
        }

        Collections.sort(employees, new EmpNameComparator());
        System.out.println("By Name");
        for(Employee e: employees){
            System.out.println(e.toString());
        }

        Collections.sort(employees, new EmpCodeComparator());
        System.out.println("By EmpCode");
        for(Employee e: employees){
            System.out.println(e.toString());
        }

        Collections.sort(employees, new EmpSalaryComparator());
        System.out.println("By Salary");
        for(Employee e: employees){
            System.out.println(e.toString());
        }
    }
    }





