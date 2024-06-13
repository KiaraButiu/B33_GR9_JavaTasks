package Iunus.week6_solutions;

public class String_PassWordValidation {


    public static boolean isValidPassword(String password) {

        //1. Password MUST be at least have 6 characters and should not contain space
        if (password.length() < 6 || password.contains(" ")) {
            return false;
        }

        boolean hasUpperCase = false;
        boolean hasLowerCase = false;
        boolean hasDigit = false;
        boolean hasSpecialChar = false;

        for (char c : password.toCharArray()) {
            //2. PassWord should at least contain one upper case letter
            if (Character.isUpperCase(c)) {
                hasUpperCase = true;
                // 3. PassWord should at least contain one lowercase letter
            } else if (Character.isLowerCase(c)) {
                hasLowerCase = true;
                //  4. Password should at least contain a digit
            } else if (Character.isDigit(c)) {
                hasDigit = true;
                //  5. Password should at least contain one special characters
            } else if (!Character.isLetterOrDigit(c)) {
                hasSpecialChar = true;
            }
        }

        return hasUpperCase && hasLowerCase && hasDigit && hasSpecialChar;
    }

    public static void main(String[] args) {
        String password = "13Abc!";
        System.out.println("isValidPassword(password) = " + isValidPassword(password));

        /*
        Write a function that can verify if a password is valid or not. requirements:






            if all requirements above are met, the method returns true, otherwise returns false
         */


    }


}
