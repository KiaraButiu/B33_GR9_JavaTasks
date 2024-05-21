package Irina.week3_solutions;

public class Number_Prime {

    /*
        Write a method that can check if a number is prime or not
     */

    public static void main(String[] args) {
        int number = 17; // Example number to check for primality
        if (isPrime(number)) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is not a prime number.");
        }
    }

    public static boolean isPrime(int number) {
        if (number <= 1) return false; // 0 and 1 are not prime

        for (int i = 2; i * i <= number; i++) {
            if (number % i == 0) return false; // If divisible by any number up to sqrt(number), it's not prime
        }

        return true;
    }


}
