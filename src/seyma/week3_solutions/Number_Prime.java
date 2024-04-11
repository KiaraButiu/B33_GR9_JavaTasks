package seyma.week3_solutions;

public class Number_Prime {

    public static void main(String[] args) {

        checkPrimeNumbers(100);
    }

    public static void checkPrimeNumbers(int num) {
        if (num <= 1) {
            throw new RuntimeException("Prime numbers cannot be equal to or less than 0.");
        }

        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                System.err.println(num + " is NOT a prime number.");
                break;

            } else {
                System.out.println(num + " is a prime number.");
                break;


            }
        }
    }

    /*
        Write a method that can check if a number is prime or not
     */


}
