package sam.week3_solutions;

public class Number_Prime {

     /*
        Write a method that can check if a number is prime or not
     */
     public static void main(String[] args) {
         int number = 103; //Number that we need to check
         System.out.println("Is the given " + number + " prime? " + primeNumber(number));
     }

     public static boolean primeNumber(int number){ // Custom method that take a number as an argument and returning boolean
         if (number <= 1 ){ // check first condition if number less than 1 exception will be thrown
             throw new NumberFormatException("Number cannot be less or equal to 1 ");
         }
         for (int i = 2; i < number ; i++) { // for loop to get all numbers between 2 and last number before provided number
             if (number % i ==0){ // check if number divisible by any numbers between 1 and itself
                 return false;
             }
         }
         return true; // return true if number not divisible by any other number
     }
}
