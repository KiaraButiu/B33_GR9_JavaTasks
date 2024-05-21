package sam.week6_solutions;

import java.util.Scanner;

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
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String password;
        System.out.println("Please provide your password");
        password = scanner.next();
        scanner.close();
        System.out.println("Validation Passed: " + passwordVerification(password));

    }

    public static boolean passwordVerification(String password){
        if(password.length() < 6){
            return false;
        }
        boolean upperCaseInPassword = false;
        boolean lowerCaseInPassword = false;
        boolean specialCharacter = false;
        boolean digit = false;

        for (char eachChar : password.toCharArray()) {
            if (Character.isUpperCase(eachChar)){
                upperCaseInPassword = true;
            }
            if (Character.isLowerCase(eachChar)){
                lowerCaseInPassword = true;
            }
            if (!Character.isLetterOrDigit(eachChar)){
                specialCharacter = true;
            }
            if (Character.isDigit(eachChar)){
                digit =true;
            }
        }


         return (upperCaseInPassword && lowerCaseInPassword && specialCharacter && digit);
    }
}
