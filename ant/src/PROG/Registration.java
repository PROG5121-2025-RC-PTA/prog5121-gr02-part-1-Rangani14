package PROG;

import javax.swing.JOptionPane;

public class Registration {
    static String allLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    static String allDigits = "0123456789";
    static String isValidUsername;
    static String isValidPassword;
    static String isValidPhoneNumber;
    
    public static void main(String[] args) {
       
        JOptionPane.showMessageDialog(null, "Welcome to ChatApp registration!");

       
        String username = JOptionPane.showInputDialog(null, "Enter your username:\n(Must include an underscore and be no longer than 5 characters)");

        if (isValidUsername(username)) {
            JOptionPane.showMessageDialog(null, "Your username has been successfully captured.");
        } else {
            JOptionPane.showMessageDialog(null, "Username is not correctly formatted.\nPlease make sure it contains an underscore and is no more than 5 characters long.");
            return;
        }

       
        String password = JOptionPane.showInputDialog(null, "Create a strong password:\n(At least 8 characters, including a capital letter, number, and special character)");

        if (isValidPassword(password)) {
            JOptionPane.showMessageDialog(null, "Awesome! Your password meets all the requirements.");
        } else {
            JOptionPane.showMessageDialog(null, "Sorry! Your password is too weak.\nIt must be at least 8 characters long and include a capital letter, a number, and a special character.");
            return;
        }

      
        String phone = JOptionPane.showInputDialog(null, "Enter your South African cell phone number:\n(Format: +27 followed by 9 digits)");

        if (isValidPhoneNumber(phone)) {
            JOptionPane.showMessageDialog(null, "Cell phone number successfully added. You're all set!");
        } else {
            JOptionPane.showMessageDialog(null, "Hmm... that number doesn't look right.\nMake sure it's in the correct format and includes the international code (+27).");
            return;
        }

     
        JOptionPane.showMessageDialog(null, "Time to log in!");

      
        String loginUsername = JOptionPane.showInputDialog(null, "Enter your username for login:\n(Must be more than 5 characters and no underscore)");

        if (isValidLoginUsername(loginUsername)) {
            JOptionPane.showMessageDialog(null, "Username is valid.");
        } else {
            JOptionPane.showMessageDialog(null, "Invalid username.\nPlease ensure your username does not contain an underscore and is more than 5 characters long.");
            return;
        }

        String loginPassword = JOptionPane.showInputDialog(null, "Enter your password for login:");

        if (isValidPassword(loginPassword)) {
            JOptionPane.showMessageDialog(null, "Password is valid.");
        } else {
            JOptionPane.showMessageDialog(null, "Invalid password.\nIt must be complex, including a capital letter, a number, and a special character.");
            return;
        }

        String loginPhone = JOptionPane.showInputDialog(null, "Enter your South African cell phone number for login:\n(Format: +27 followed by 9 digits)");

        if (isValidPhoneNumber(loginPhone)) {
            JOptionPane.showMessageDialog(null, "Login successful! You are now logged in.");
        } else {
            JOptionPane.showMessageDialog(null, "Invalid phone number.\nPlease ensure it is in the correct format (+27 followed by 9 digits).");
        }
    }

    
    public static boolean isValidUsername(String username) {
        return username != null && username.contains("_") && username.length() <= 5;
    }

    
    public static boolean isValidLoginUsername(String username) {
        return username != null && !username.contains("_") && username.length() > 5;
    }

   
    public static boolean isValidPassword(String password) {
        if (password == null || password.length() < 8) return false;

        boolean hasUpper = password.matches(".*[A-Z].*");
        boolean hasDigit = password.matches(".*\\d.*");
        boolean hasSpecialChar = password.matches(".*[!@#$%^&()_+\\{}:<>|,.?/-].*");

        return hasUpper && hasDigit && hasSpecialChar;
    }

  
    public static boolean isValidPhoneNumber(String number) {
        return number != null && number.matches("^\\+27\\d{9}$");
    }
}
