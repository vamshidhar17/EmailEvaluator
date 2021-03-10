import java.util.HashSet;
import java.util.Scanner;

public class EmailValidatorTest {
    private static final HashSet<String> validEmailIds = new HashSet<>();

    private static final EmailValidator emailValidator = new EmailValidator();

    public static void main(String[] args) {
        int choice;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Welcome to Email Validator!!!");
            System.out.println("Enter 1 to Add Email Id");
            System.out.println("Enter 2 to Search for Email Id");
            System.out.println("Enter 3 to Exit\n");
            System.out.println("Enter your choice:");
            choice = sc.nextInt();
            String email;
            switch (choice) {
                case 1:
                    System.out.println("Enter your Email id");
                    email = sc.next();
                    if (emailValidator.validateEmail(email)) {
                        validEmailIds.add(email);
                        System.out.println("It is a valid email id!\n");
                    } else {
                        System.out.println("Not a valid Email Id! Please Enter a valid Email Id.\n");
                    }
                    break;
                case 2:
                    System.out.println("Enter the Email Id that you want to search.");
                    email = sc.next();
                    if (emailValidator.validateEmail(email) && validEmailIds.contains(email)) {
                        System.out.println("Email Id: " + email + " is present!\n");
                    } else {
                        System.out.println("Email Id not present! Please try again.\n");
                    }
                    break;
                case 3:
                    break;
            }
        } while (choice != 3);
    }
}
