import java.util.*;

public class login {
    private String name, password;
    private String choice;
    private static final String CORRECT_USERNAME = "Collins";
    private static final String CORRECT_PASSWORD = "Ck123";
    private static final int MAX_ATTEMPTS = 3;
    Scanner sc = new Scanner(System.in);
    
    public void getCredentials() {
        int attempts = 0;
        boolean loggedIn = false;
        
        while (attempts < MAX_ATTEMPTS && !loggedIn) {
            System.out.println("\nEnter your Username: ");
            name = sc.nextLine();
            System.out.println("Enter your Password: ");
            password = sc.nextLine();
            
            if (name.equalsIgnoreCase(CORRECT_USERNAME) && password.equals(CORRECT_PASSWORD)) {
                System.out.println("Login successful!");
                System.out.println("Welcome to REALITY COMPANY, " + name + "!");
                loggedIn = true;
            } else {
                attempts++;
                int remaining = MAX_ATTEMPTS - attempts;
                System.out.println("Wrong password or Username!");
                
                if (remaining > 0) {
                    System.out.println("You have " + remaining + " attempts remaining");
                    System.out.println("Do you want to change your details? (y/n): ");
                    choice = sc.nextLine();
                    
                    if (choice.equalsIgnoreCase("y")) {
                        setDetails();
                        // After changing details, check against new credentials
                        if (name.equalsIgnoreCase(CORRECT_USERNAME) && password.equals(CORRECT_PASSWORD)) {
                            System.out.println("Login successful with new credentials!");
                            loggedIn = true;
                            break;
                        }
                    } else if (choice.equalsIgnoreCase("n")) {
                        System.out.println("Continuing with next attempt...");
                    } else {
                        System.out.println("Invalid choice! Continuing with next attempt...");
                    }
                } else {
                    System.out.println("Maximum login attempts exceeded. Program will exit.");
                    System.exit(0);
                }
            }
        }
        
        if (!loggedIn) {
            System.out.println("Too many failed attempts. Please try again later.");
        }
    }
    
    public void setDetails() {
        System.out.println("Enter your preferred Username: ");
        name = sc.nextLine();
        System.out.println("Enter your new password: ");
        password = sc.nextLine();
        System.out.println("Your new Username is: " + name + " and password is: " + password + ". Please save them.");
    }
    
    public static void main(String[] args) {
        System.out.println("=== REALITY COMPANY ===");
        System.out.println("Welcome to the Login System\n");
        login L = new login();
        L.getCredentials();
        L.sc.close(); // Close scanner to prevent resource leak
    }
}