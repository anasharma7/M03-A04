package src;

public class User {
    private String username;
    private String password; // Note: Passwords should be stored as hashes in production

    // Constructor
    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    // Getters and Setters
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    // Verify the password of the user (In a real application, this should check a hashed password)
    public boolean verifyPassword(String password) {
        return this.password.equals(password);
    }

    // Override the toString method for debugging purposes
    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
