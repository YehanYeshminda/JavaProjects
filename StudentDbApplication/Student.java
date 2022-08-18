package StudentDbApplication;

import java.util.Scanner;

public class Student {
    private String firstName;
    private String lastName;
    private int gradeYear;
    private String studentId;
    private String courses;
    private int tuitionBalance;
    private static int costOfCourse = 1000; // this belongs to the class not the instance
    private static int id = 1000; // this belongs to the class not the instance

    // prompts the user to enter the student name and year
    public Student(){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Student First Name: ");
        this.firstName = input.next();

        System.out.print("Enter Student Last Name: ");
        this.lastName = input.next();

        System.out.print("1- Freshmen \n2- Sophmore \n3- Junior \n4- Senior \nEnter Student Graduation Year: ");
        this.gradeYear = input.nextInt();

        setStudentId();
        System.out.println("First Name : "+ firstName + "\nLast name: " + lastName +"\nGrade Year: "+ gradeYear +"\nStudent ID: "+ studentId);

    }

    // generate a id
    private void setStudentId(){
        // grade level + then id
        id++; // everytime a new student is made id will increment
        this.studentId = gradeYear + "" + id;
    }

    // enroll in the courses

    // view balance

    // pay tuition

    // show status
}
