package Irina.week1_solution;

public class Numbers_OddOrEven {

    public static void main(String[] args) {
        checkOddEven(4);

    }

    public static void checkOddEven(int number) {

        if(number % 2 == 0) {
            System.out.println("even");
        } else {
            System.out.println("odd");
        }
    }
}


