package src;

import java.util.Scanner;

public class LoginView {
    private LoginController loginController;
    private Scanner scanner;

    public LoginView(LoginController loginController) {
        this.loginController = loginController;
        this.scanner = new Scanner(System.in);
    }

    public void showLogin() {
        System.out.println("Please log in:");
        System.out.print("Username: ");
        String username = scanner.nextLine();
        System.out.print("Password: ");
        String password = scanner.nextLine();

        boolean success = loginController.login(username, password);
        if (success) {
            // Navigate to the main part of the application or show the main menu
            System.out.println("Navigating to the main application...");
        } else {
            System.out.println("Please try again.");
            showLogin(); // Show login prompt again
        }
    }
}
