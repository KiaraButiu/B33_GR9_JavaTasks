package batuhan.week1_solutions;

public class Numbers_OddOrEven {

    /*
    Write  a method which can identifies given number is even or odd
        EX:
        identify(5) ->  "Odd"
        identify(6) ->  "Even"

     */

    public static void main(String[] args) {
        oddOrEven(5);
    }


    public static void oddOrEven(int num1){

        if (num1 % 2 == 0){
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }

    }
}
