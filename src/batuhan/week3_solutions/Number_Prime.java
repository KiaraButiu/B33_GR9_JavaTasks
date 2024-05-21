package batuhan.week3_solutions;

public class Number_Prime {


    //        Write a method that can check if a number is prime or not

    public static void main(String[] args) {
        System.out.println(isPrime(7));
        System.out.println(isPrime(10));
        System.out.println(isPrime(13));
        System.out.println(isPrime(17));
        System.out.println(isPrime(20));
        System.out.println(isPrime(23));
    }

    public static boolean isPrime(int number){
        if(number <= 1){
            return false;
        }
        for(int i = 2; i < number; i++){
            if(number % i == 0){
                return false;
            }
        }
        return true;
    }




}
