package src;

public class LoginController {
    private User currentUser;

    public boolean login(String username, String password) {
        // In a real application, you should query the database for the user instead of creating a new one
        // Here, we're creating a new User object for demonstration purposes
        User user = new User(username, password); // Replace with user retrieval logic

        if (user.verifyPassword(password)) {
            this.currentUser = user;
            System.out.println("Login successful for user: " + username);
            return true;
        } else {
            System.out.println("Login failed for user: " + username);
            return false;
        }
    }

    public User getCurrentUser() {
        return currentUser;
    }
}
