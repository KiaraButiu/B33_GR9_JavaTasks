package kiara.week1_solution;

public class Numbers_OddOrEven {

    public static void main(String[] args) {
        oddOrEven(20);
    }

    public static void oddOrEven (int num){     // this method takes int "num" as input

        if (num %2 == 0){                                           // if num is divisible by 2 meaning remainder is 0, then it is EVEN
            System.out.println(num + " is an even number.");
        }else{
            System.out.println(num + " is an off number.");         // Otherwise, it is ODD
        }
    }
}
    /*
    Write  a method which can identifies given number is even or odd
        EX:
        identify(5) ->  "Odd"
        identify(6) ->  "Even"

     */
