package Irina.week3_tasks;

public class Number_ReverseInteger {

/*
Write a return method that can reverse
negative number and return it as int
 */

    public static void main(String[] args) {
        int originalNumber = -4789; // Example negative number
        int reversedNumber = reverseNegativeNumber(originalNumber);
        System.out.println("Original number: " + originalNumber);
        System.out.println("Reversed number: " + reversedNumber);
    }

    public static int reverseNegativeNumber(int number) {
        if (number < 0) {
            // Remove the negative sign
            number = -number;
            int reversed = 0;
            while (number != 0) {
                int digit = number % 10; // Extract the last digit
                reversed = reversed * 10 + digit; // Append the digit to the reversed number
                number /= 10; // Remove the last digit from the original number
            }
            return -reversed; // Add back the negative sign to the reversed number
        } else {
            return number; // If the number is not negative, return it as is
        }
    }

}
