package emailApp;

// import used to get import
import java.util.Locale;
import java.util.Scanner;

public class Email {

    // encapsulate it because we don't want people to access our variables
    private String fName;
    private String lName;
    private String password;
    private String department;
    private int mailBoxCapacity = 200;
    private String alternateEmail;
    private String email;
    private String companySuffix = "esoft.com";


    // constructor to receive first name and the lastname
    public Email(String firstName, String lastName){

        // variable assigning after getting the first name and the last name
        // this refers to the class level
        this.fName = firstName;
        this.lName = lastName;

      //  System.out.println("Email made for " + this.fName + " " +this.lName);

        // after taking the names call a method to get the department
        this.department = setDepartment();

        System.out.println("The department is: " + this.department );

        // after taking the names and the departments we call a method which returns a random password
       // this.password = randomPassword(10);

        // combine all the elements and then define the email
        this.email = fName.toLowerCase() +"."+ lName.toLowerCase()+"@"+department+"."+companySuffix;

      //  System.out.println("Your Email is : "+ this.email);
     //   System.out.println("Your Password is : " + this.password);
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
            return "sales";
        }
        else if (choiceDepartment == 2){
            return "development";
        }
        else if (choiceDepartment == 3){
            return "accounting";
        }
        else{
            return "none";
        }
    }


    // generate a random password
    private String randomPassword(int length) { // length is on how long the password should be
        String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789@!#$%&*";
        char[] password = new char[length]; // will equal to array of characters on the size of length

        for (int i = 0; i < length; i++){

            // make it an int and then store it in a variable
            // math . random = 0 and 1 * the size of the passwordSet
            int randomValue  = (int) (Math.random() * passwordSet.length());

            // the index at i in the password array will equal to the character the random value in the array
            password[i] = passwordSet.charAt(randomValue);
        }

        // passing the password as a string as a new string everytime this function is called
        return new String(password);
    }


    // set the mailbox capacity
    public void setMailBoxCapacity(int capacity) { this.mailBoxCapacity = capacity; }

    // set the alternate email
    public void setAlternateEmail(String emailAlt) { this.alternateEmail = emailAlt; }

    // change the password
    public void changePassword(String pass) { this.password = pass; }

    // this below is data binding or data encapsulation

    // showing the mailbox capacity with a get method
    public int getMailBoxCapacity() { return mailBoxCapacity;}

    // getting the alternate email and then returning it
    public String getAlternateEmail() { return "Alternate email : " + alternateEmail;}

    // getting the password and then returning it
    public String getPassword() { return "Password : " + password; }

    // method to show all the information which is being entered in a correct order
    public String showInformation(){
        return "Display Name : " + this.fName + " " + this.lName + "\nEmail : " + this.email + "\nMailbox Capacity : " + this.mailBoxCapacity;
    }
}
