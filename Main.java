import java.util.ArrayList;
import java.util.Scanner;

class Student {
    int rollNo;
    String studentName;
    String department;
    Student(int rollNo, String studentName, String department) {
        this.rollNo = rollNo;
        this.studentName = studentName;
        this.department = department;
    }
}
public class Main {
    public static void main(String[] args) {
        ArrayList<Student> studentList = new ArrayList<Student>();
        Scanner input = new Scanner(System.in);
        int option;
        do {
            System.out.println("\n--- STUDENT MANAGEMENT SYSTEM ---");
            System.out.println("1.Add 2.View 3.Search 4.Delete 5.Exit");
            System.out.print("Choice: ");
            option = input.nextInt();
            if (option == 1) {
                System.out.print("Enter Roll No: "); int rno = input.nextInt();
                input.nextLine();
                System.out.print("Enter Name: "); String name = input.nextLine();
                System.out.print("Enter Dept: "); String dept = input.nextLine();
                studentList.add(new Student(rno, name, dept));
                System.out.println("Added Successfully");
            } else if (option == 2) {
                for (Student stud : studentList) {
                    System.out.println(stud.rollNo + " | " + stud.studentName + " | " + stud.department);
                }
            } else if (option == 3) {
                System.out.print("Search Roll No: "); int rno = input.nextInt();
                for (Student stud : studentList) if (stud.rollNo == rno) System.out.println("Found: " + stud.studentName);
            } else if (option == 4) {
                System.out.print("Delete Roll No: "); int rno = input.nextInt();
                studentList.removeIf(s -> s.rollNo == rno);
                System.out.println("Deleted if existed");
            }
        } while (option != 5);
        input.close();
    }
}