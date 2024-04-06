package natalia.week3_solutions;

public class Number_Prime {
    public static void main(String[] args) {

        checkIfnumberPrime(29);
    }

    public static void checkIfnumberPrime(int a) {
        for (int i = 2; i < a / 2; i++) {
            if (a % i == 0) {
                System.out.println("number " + a + " is Not prime");
                return;
            }
        }
        System.out.println("number " + a + " is prime");
    }
    /*
        Write a method that can check if a number is prime or not
     */


}
