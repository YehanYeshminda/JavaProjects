package emailApp;

// import used to get import
import java.util.Scanner;

public class Email {

    // encapsulate it because we don't want people to access our variables
    private String fName;
    private String lName;
    private String password;
    private String department;
    private int mailBoxCapacity;
    private String alternateEmail;

    // constructor to receive first name and the lastname
    public Email(String firstName, String lastName){

        // variable assigning after getting the first name and the last name
        // this refers to the class level
        this.fName = firstName;
        this.lName = lastName;

        System.out.println("Email made for " + this.fName + " " +this.lName);

        // after taking the names call a method to get the department
        this.department = setDepartment();

        System.out.println("The department is: " + this.department );
    }

    // ask for the department
    // if we return a string from the whole function then we set the method to string
    // if we return nothing then we can use void
    private String setDepartment() {
        System.out.print("Department codes:  \n1 for Sales \n2 for Development \n3 for Accounting \n0 for None \nEnter the department code :");

        // getting user input
        Scanner input = new Scanner(System.in);

        // since the user is inputting a integer we can use nextInt else if string we can use nextLine
        int choiceDepartment = input.nextInt();

        // validating the user input for a division
        if (choiceDepartment == 1){
            return "Sales";
        }
        else if (choiceDepartment == 2){
            return "Development";
        }
        else if (choiceDepartment == 3){
            return "Accounting";
        }
        else{
            return "None";
        }
    }

    // generate a random password

    // set the mailbox capacity

    // set the alternate email

    // change the password

}
