package miniProject.employeeManagement;

import java.util.HashSet;
import java.util.Scanner;

public class EmployeeService {
    HashSet<Employee> empset = new HashSet<Employee>();

    Employee emp1 = new Employee(101, "Raju", 24, " Java Developer", "IT", 35000);
    Employee emp2 = new Employee(102, "Swami", 26, "Tester", "CO", 20000);
    Employee emp3 = new Employee(103, "niketan", 28, "H.R", "IT", 50000);
    Employee emp4 = new Employee(104, "vinay", 30, "Manager", "IT", 80000);

    Scanner sc = new Scanner(System.in);
    boolean found = false;
    int id;
    String name;
    int age;
    String department;
    String designation;
    double salary;

    public EmployeeService() {
        empset.add(emp1);
        empset.add(emp2);
        empset.add(emp3);
        empset.add(emp4);

    }

    //view all Emp
    public void viewAllEmp() {

        for (Employee emp : empset) {
            System.out.println(emp);

        }
    }

    //view emp based on their id;
    public void viewEmp() {
//        boolean found = false;
        System.out.println("Enter id");
        id = sc.nextInt();
        for (Employee emp : empset) {
            if (emp.getId() == id) {
                System.out.println(emp);
                found = true;
            }
        }

        if (!found) {
            System.out.println("Employee Id is not present");
        }
    }

    // Update Employee
    public void updateEmployee() {
        System.out.println("Enter id : ");
        id = sc.nextInt();
        boolean found = false;
        for (Employee emp : empset) {
            if (emp.getId() == id) {
                System.out.println("Enter Name :");
                name = sc.next();
                System.out.println("Enter New Salary");
                salary = sc.nextDouble();
                emp.setName(name);
                emp.setSalary(salary);
                System.out.println("Update Details");
                System.out.println(emp);
                found = true;
            }
        }
        if (!found) {
            System.out.println("Employee is not Present");
        } else {
            System.out.println("Employee Details Updated Successfully");
        }
    }

    //delete Employee
    public void deleteEmp() {
        System.out.println("Enter id");
        id = sc.nextInt();
        boolean found = false;
        Employee empdelete = null;
        for (Employee emp : empset) {
            if (emp.getId() == id) {
                empdelete = emp;
                found = true;
            }
        }
        if (!found) {
            System.out.println("Employee not Available");
        } else {
            System.out.println("Employee Delete Successfully");
        }
    }

    //add Employee
    public void addEmp()
    {
        System.out.println("Enter id");
        id = sc.nextInt();
        System.out.println("Enter Name");
        name = sc.next();
        System.out.println("Enter Age");
        age = sc.nextInt();
        System.out.println("Enter Designation");
        designation = sc.next();
        System.out.println("Enter Department");
        department = sc.next();
        System.out.println("Enter Salary");
        salary = sc.nextDouble();

        Employee emp = new Employee(id, name, age, designation, designation, salary);
        empset.add(emp);
        System.out.println("Employee Added Successfully");

    }
}







