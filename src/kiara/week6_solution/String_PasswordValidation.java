package kiara.week6_solution;

public class String_PasswordValidation {

    public static void main(String[] args) {
        String password1 = "iLoveTe$ting";
        System.out.println(isPasswordValid(password1));

        String password2 = "ilove567890-=";
        System.out.println(isPasswordValid(password2));

    }

    public static boolean isPasswordValid(String password){

        if (password.length() < 6 ){
            return false;
        }

        boolean hasUpperCase = false;
        boolean hasLowerCase = false;
        boolean hasSpecialCharacter = false;
        boolean hasDigit = false;

        for (char eachChar : password.toCharArray()) {    // to access each character of String password

            if (Character.isUpperCase(eachChar)){
               hasUpperCase = true;
            }
            if (Character.isLowerCase(eachChar)){
                hasLowerCase = true;
            }
            if (!Character.isLetterOrDigit(eachChar)){
                hasSpecialCharacter = true;
            }
            if (Character.isDigit(eachChar)){
                hasDigit = true;
            }
        }
        return true;

    }
}
  /*
    Write a function that can verify if a password is valid or not. requirements:
                1. Password MUST be at least have 6 characters and should not contain space
                2. PassWord should at least contain one upper case letter
                3. PassWord should at least contain one lowercase letter
                4. Password should at least contain one special characters
                5. Password should at least contain a digit

        if all requirements above are met, the method returns true, otherwise returns false
     */
