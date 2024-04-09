package alena.week3_solutions;

public class Number_Prime {
    public static void main(String[] args) {
        int num = 103;

        for (int i = 2; i < num; i++) {


            if (num % i == 0) {
                System.out.println(num + " is a not prime number");
                return;

            }

        }
        System.out.println(num + " a prime number.");
    }
}
/*
        Write a method that can check if a number is prime or not
     */

