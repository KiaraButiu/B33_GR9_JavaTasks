package polina.week3_solutions;

public class Number_Prime {
    public static boolean checkPrimeOrNot(int num) { //13
        if (num <= 1) { // if the given number will be less than 1, because prime number s a natural number greater than 1 that has no positive divisors other than 1 and itself.
            return false;
        }
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int prime = 13;
        System.out.println("Is the number " + prime +" prime? " + checkPrimeOrNot(prime));
    }
    /*
        Write a method that can check if a number is prime or not
     */
}
