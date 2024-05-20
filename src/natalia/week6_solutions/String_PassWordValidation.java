package natalia.week6_solutions;

public class String_PassWordValidation {
    public static void main(String[] args) {

        boolean isValid = passwordIsValid("rH1abc?");
        System.out.println(isValid);
    }

    public static boolean passwordIsValid(String password) {

        if (password.length() < 6) {
            System.out.println("Password MUST be at least have 6 characters");
            return false;
        }
        if (password.contains(" ")) {
            System.out.println("Password should not contain space ");
            return false;
        }

        int upperCase = 0;
        int lowerCase = 0;
        int specialCharacter = 0;
        int digit = 0;

        for (char ch : password.toCharArray()) {
            if(Character.isUpperCase(ch)){
                upperCase++;
            }
            if(Character.isLowerCase(ch)){
                lowerCase++;
            }
            if(Character.isDigit(ch)){
                digit ++;
            }else if (!Character.isLetterOrDigit(ch)) {
                specialCharacter++;
            }
        }

        if (upperCase == 0 || lowerCase == 0 || digit == 0 || specialCharacter == 0 ){
            System.out.println(" Password should at least contain one upper case letter,one lowercase letter, " +
                    "one special characters, a digit ");
            return false;
        }
            return true;
        }
    }




    /*
    Write a function java that can verify if a password is valid or not. requirements:
                1. Password MUST be at least have 6 characters and should not contain space
                2. PassWord should at least contain one upper case letter
                3. PassWord should at least contain one lowercase letter
                4. Password should at least contain one special characters
                5. Password should at least contain a digit

        if all requirements above are met, the method returns true, otherwise returns false
     */


//System.out.println(passwordIsValid("123abc?"));



