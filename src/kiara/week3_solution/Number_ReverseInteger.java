package kiara.week3_solution;

public class Number_ReverseInteger {
    /* Write a return method that can reverse negative number and return it as int */

    public static int reverseNegativeNumber (int num){

        int reversedInt = 0;                                // will store reversed integer

        while(num != 0){                                    // loop will continue to iterate until number = 0
            int digit = num % 10;                           // store the last digit of num, extract last digit --> this will give us the remainder of the num
            reversedInt = reversedInt * 10 + digit;         // append the extracted digit
            num /= 10;                                      // remove the last digit of the number

        }
        return reversedInt;
    }

    public static void main(String[] args) {
        int number = -123;
        System.out.println("reverseNegativeNumber(number) = " + reverseNegativeNumber(number));
    }
}

