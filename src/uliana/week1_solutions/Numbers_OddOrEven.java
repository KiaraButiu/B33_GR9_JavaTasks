package uliana.week1_solutions;

public class Numbers_OddOrEven {
    public static void main(String[] args) {
        oddOrEven(100);
        oddOrEven(10);
        int a = 203;
        oddOrEven(a);

    }
    public static void oddOrEven(int number){
        if (number %2 ==0){
            System.out.println(number + " is even number");
        } else {
            System.out.println(number + " is odd number");
        }


    }
}

    /*
    Write  a method which can identifies given number is even or odd
        EX:
        identify(5) ->  "Odd"
        identify(6) ->  "Even"

     */
