package uliana.week3_tasks;

public class Number_ReverseInteger {

/*
Write a return method that can reverse
negative number and return it as int
 */
public static int reverseNegative(int number) {
    if (number < 0) {
        // Remove the negative sign and reverse the digits
        String reversedString = new StringBuilder(String.valueOf(-number)).reverse().toString();
        // Add the negative sign back
        return -Integer.parseInt(reversedString);
    } else {
        // If the number is positive, return it as is
        return number;
    }
}

    public static void main(String[] args) {
        int negativeNumber = -123;
        System.out.println("Reversed negative number: " + reverseNegative(negativeNumber));
    }
    public static int reverseNegativeNumber (int num){

        int reversedInt = 0;                                // will store reversed integer

        while(num != 0){                                    // loop will continue to iterate until number = 0
            int digit = num % 10;                           // store the last digit of num, extract last digit --> this will give us the remainder of the num
            reversedInt = reversedInt * 10 + digit;         // append the extracted digit
            num /= 10;                                      // remove the last digit of the number

        }
        return reversedInt;
    }




}
