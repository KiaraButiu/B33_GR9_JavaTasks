package uliana.week6_tasks;

public class String_PassWordValidation {

    /*
    Write a function that can verify if a password is valid or not. requirements:
                1. Password MUST be at least have 6 characters and should not contain space
                2. PassWord should at least contain one upper case letter
                3. PassWord should at least contain one lowercase letter
                4. Password should at least contain one special characters
                5. Password should at least contain a digit

        if all requirements above are met, the method returns true, otherwise returns false
     */
    public static boolean isValidPassword(String password) {
        // Check if the password length is at least 6 characters and doesn't contain spaces
        if (password.length() < 6 || password.contains(" ")) {
            return false;
        }

        // Check if the password contains at least one uppercase letter
        boolean hasUppercase = !password.equals(password.toLowerCase());

        // Check if the password contains at least one lowercase letter
        boolean hasLowercase = !password.equals(password.toUpperCase());

        // Check if the password contains at least one digit
        boolean hasDigit = password.matches(".*\\d.*");

        // Check if the password contains at least one special character
        boolean hasSpecialChar = password.matches(".*[!@#$%^&*()_+\\-=\\[\\]{};':\",./<>?\\\\|].*");

        // Return true if all conditions are met
        return hasUppercase && hasLowercase && hasDigit && hasSpecialChar;
    }


    public static void main(String[] args) {
        String testPassword = "MyP@ssw0rd"; // Replace with the actual password to test

        System.out.println(isValidPassword(testPassword));
    }





}
