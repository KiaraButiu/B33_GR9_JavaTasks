package Iunus.week3_solutions;

public class Number_ReverseInteger {
    /*
Write a return method that can reverse
negative number and return it as int
 */
    public static void main(String[] args) {
        reverseInteger(0); //Calling method to test
        reverseInt(-321);
    }

    public static int reverseInteger(int number){
        int reversedNumber = 0; // Creating a variable for reversed version
       if (number < 1){ // Condition to make sure that given number is negative
           reversedNumber = -(number); // reversing number that was provided
       }

        if (number == 0){ // different outputs depending on what number was provided
            System.out.println("This number " + number + " can not be reversed");
        } else if (number > 1){
            System.out.println("This number " + number + " no need to be reversed");
        } else {
            System.out.println("Reversed version of this number equals to: " + reversedNumber);
        }
       return reversedNumber;
    }

    public static void reverseInt(int number){
        String stringNumber = number + "";

        String onlyDigits = stringNumber.substring(1);
        System.out.println(onlyDigits);

        StringBuilder reversedString = new StringBuilder();

        for (int i = onlyDigits.split("").length - 1; i >= 0; i--) {
            reversedString.append(onlyDigits);
        }


    }
}
