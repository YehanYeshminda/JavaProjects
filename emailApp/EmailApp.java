package emailApp;

public class EmailApp {
    public static void main(String[] args) {
        // calling the object from email and then declaring the parameters for the constructor
        Email email1 = new Email("Yehan", "Yeshminda");

//         email1.setMailBoxCapacity(10);
//         email1.changePassword("asdasd");
//         email1.setAlternateEmail("sadasd");


//        email1.setAlternateEmail("broommmm");
//        System.out.println(email1.getAlternateEmail());

        System.out.println(email1.showInformation());
    }
}
