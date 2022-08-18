package StudentDbApplication;

import java.util.Scanner;

public class Student {
    private String firstName;
    private String lastName;
    private int gradeYear;
    private String studentId;
    private String courses = null;
    private int tuitionBalance = 0; // in order to add to this we make this 0
    private static int costOfCourse = 1000; // this belongs to the class not the instance
    private static int id = 1000; // this belongs to the class not the instance

    Scanner input = new Scanner(System.in);

    // prompts the user to enter the student name and year
    public Student(){


        System.out.print("Enter Student First Name: ");
        this.firstName = input.next();

        System.out.print("Enter Student Last Name: ");
        this.lastName = input.next();

        System.out.print("1- Freshmen \n2- Sophmore \n3- Junior \n4- Senior \nEnter Student Graduation Year: ");
        this.gradeYear = input.nextInt();

        setStudentId();
        System.out.println(firstName + " " + lastName +" "+ gradeYear +" "+ studentId);

    }

    // generate a id
    private void setStudentId(){
        // grade level + then id
        id++; // everytime a new student is made id will increment
        this.studentId = gradeYear + "" + id;
    }

    // enroll in the courses
    public void enrollCourses(){

        do {
            System.out.print("Enter course to enroll :  (Q to Quit)");
            String course = input.next().toLowerCase();

            if (!course.equals("q")){
                courses = courses + "\n" + course;
                tuitionBalance = tuitionBalance + costOfCourse;
            }
            else{

                // if the inserted string is q then we break from the loop
                break;
            }
        } while (1 != 0); // which means forever


        System.out.println("Enrolled in : "+ courses);
    }

    // view balance
    public void viewBalance(){
        System.out.println("Your balance is : $"+ this.tuitionBalance);
    }

    // pay tuition
    public void payTuition(){

        viewBalance();
        System.out.print("Enter a Amount for the Payment : $");
        int payment = input.nextInt();

        tuitionBalance = tuitionBalance - payment;
        System.out.println("Thank you for the payment of : $" + payment);
        viewBalance();
    }

    // show status
}
