package alice.week1_solutions;

public class Numbers_OddOrEven {

    public static void main(String[] args) {
        checkOddEven(7);

    }

    public static void checkOddEven(int number) {

        //modulo operator (%), which gives the remainder of a division operation
        //If the remainder is 0 when divided by 2, then the number is even

        if(number % 2 == 0) {
            System.out.println(number+ " even");
        } else {
            System.out.println(number + " odd");
        }
    }

}
