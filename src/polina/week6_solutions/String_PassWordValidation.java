package polina.week6_solutions;

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

        boolean haveUpper = false;
        boolean haveLower = false;
        boolean haveSpecial =false;
        boolean haveDigit =false;

        for (int i = 0; i < password.length(); i++) {

            if (Character.isUpperCase(password.charAt(i))) {
                haveUpper = true;
            }
            if (Character.isLowerCase(password.charAt(i))) {
                haveLower = true;
            }
            if (Character.isDigit(password.charAt(i))) {
                haveDigit = true;
            }
            if (!Character.isLetterOrDigit(password.charAt(i))) {
                haveSpecial = true;
            }
        }

        if (password.length() < 6 || password.contains(" ") || !haveUpper || !haveLower || !haveDigit || !haveSpecial) {
            return false;
        }

        return true;
    }


    public static void main(String[] args) {

        System.out.println(isValidPassword("Pol8@"));

    }

}
