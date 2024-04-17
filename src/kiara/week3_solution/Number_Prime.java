package kiara.week3_solution;

public class Number_Prime {
 /*  Write a method that can check if a number is prime or not
 * PRIME NUMBER : is a number that cannot be evenly divided by any number except 1 and itself.
 * Examples : 2, 3, 5, 7, 11.....   */

    public static boolean checkIfPrimeNumber(int number){  // custom method will return a boolean T/F, parameter is an integer

        if(number <= 1){                                // If number value is <= 1 --> return False because Prime #'s are greater than 1
            return false;
        }
        for (int i = 2; i < number ; i++) {              //Loop Counter is starting at 2 since Prime cannot be equal to 1
            if ( number % i == 0){                       // if number is divisible by "i" value
                return false;                           // then return False, because it is not prime
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int num = 1;
        int num2 = 25;

        System.out.println(num + " is a prime number: " + checkIfPrimeNumber(num));
        System.out.println(num2 + " is a prime number: " + checkIfPrimeNumber(num2));
    }

}

