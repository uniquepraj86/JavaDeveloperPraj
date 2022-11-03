package assignments;

import java.util.Scanner;

public class Employee {
        private int id;
        private int salary;
        private String name;
        private String department;

        public Employee() {
        }

        public Employee(int id, int salary, String name, String department) {
            this.id = id;
            this.salary = salary;
            this.name = name;
            this.department = department;
        }

        void accept(){
            Scanner sc=new Scanner(System.in);
            System.out.print("Name:");
            name=sc.next();
            System.out.print("Id:");
            id=sc.nextInt();
            System.out.print("Salary:");
            salary=sc.nextInt();
            System.out.print("Department:");
            department=sc.next();
        }

        void display(){
            System.out.println("Id: "+id);
            System.out.println("Name: "+name);
            System.out.println("Salary: "+salary);
            System.out.println("Department: "+department);
        }


        public int getSalary() {
            return salary;
        }


    }
    class Manager extends Employee{
        private int bonus;

        public Manager() {
        }

        public Manager(int bonus) {
            this.bonus = bonus;
        }

        void accept(){
            super.accept();
            Scanner sc=new Scanner(System.in);
            System.out.print("Bonus:");
            bonus=sc.nextInt();
            System.out.println("------------------------");
        }
        void display()
        {
            super.display();
            System.out.println("Bonus : "+bonus);
        }
        static void maximum(Manager m[]){
            int max=0,total=0,id=0;
            for(int i=0;i<m.length;i++)
            {
                total=(m[i].getSalary())+m[i].bonus;
                if(max<total)
                {
                    max=total;
                    id=i;
                }
            }
            System.out.println("Maximum Salary Employee : ");
            m[id].display();
        }
    }
    class MaxImpl {
        public static void main(String[] args) {
            System.out.println("----Enter Employee Details----");
            Manager[] m1 = new Manager[3];
            for (int i = 0; i < m1.length; i++) {

                m1[i] = new Manager();
                m1[i].accept();

            }
            Manager.maximum(m1);
        }

    }



