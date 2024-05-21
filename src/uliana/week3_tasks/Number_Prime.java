package uliana.week3_tasks;

public class Number_Prime {

    /*
        Write a method that can check if a number is prime or not
     */
    public static boolean isPrime(int n) {
        if (n <= 1) { //We first check if the number is less than or equal to 1. If so, it’s not prime.
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {//Then we iterate from 2 up to the square root of the number. If any divisor is found, the number is not prime.
                return false;
            }
        }
       return true; //Otherwise, it’s considered prime.

    }

    public static void main(String[] args) {
        int number = 17;
        System.out.println(number + " is prime: " + isPrime(number));
    }
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



}
