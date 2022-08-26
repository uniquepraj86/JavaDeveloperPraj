package colletion;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static javax.swing.text.html.parser.DTDConstants.ID;

public class StudentDemo {
    int id;
    String Fname;
    String Mname;
    String Lname;
    String contactNo;


    public static void main(String[] args) {
        List<String> students = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Id");
        System.out.println("Enter Student First Name");
        String Fname = sc.nextLine();
        System.out.println("Enter Student Middle name ");
        String Mname = sc.nextLine();
        System.out.println("Enter Student Last name");
        String Lname = sc.nextLine();
        System.out.println("Enter Student Contact No");
        String contactno = sc.nextLine();
        System.out.println("Display full Name");
        String fullname = Fname +" ".concat(Mname) +" ". concat(Lname)+" " . concat(contactno);
        System.out.println(fullname);


        System.out.println("Do you want change your Id");
        System.out.println("1.yes");
        System.out.println("2 No");
        String A = null;
        int choice = sc.nextInt();
        switch (choice) {
            case 1:
                System.out.println("Enter new ID: ");
                A = sc.next();
                break;
            case 2:
                System.out.println("your ID is: " + ID);
                break;
            default:
                System.out.println("Either select 1 or 2");
        }
        if (choice == 1) {
            students.add(A);
//            students.add(Fname);
//            students.add(Mname);
//            students.add(Lname);
//            students.add(contactno);
            students.add(fullname);
            System.out.println(students);
        } else {
//            students.add(String.valueOf(ID));
//            students.add(Fname);
//            students.add(Mname);
//            students.add(Lname);
//            students.add(contactno);
            students.add(fullname);
            System.out.println(students);

        }
    }
}



