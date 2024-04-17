package greg.week3_solution;

public class Number_Prime {

    public static void main(String[] args) {
        int primeNum = 13;
        System.out.println("Is the number " + primeNum + " a prime number? " + isPrime(primeNum));;
    }
    public static boolean isPrime(int number) {

        if (number <= 1) {
            return false;
        }
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}



    /*
        Write a method that can check if a number is prime or not
     */