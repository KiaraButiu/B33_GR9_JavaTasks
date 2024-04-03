package alena.week1_solutions;

public class Numbers_OddOrEven {

    public static void main(String[] args) {

        identify(9);                           //5. Calling a method with argument
    }

    public static void identify(int num) {          //1. Create method with one integer parameters

        if (num % 2 == 0) {                            //2. Create if else statement evaluates a boolean expression
            System.out.println(num + " Even number"); //3. If remainder when num divided by 2 is 0, it prints:
        } else {
            System.out.println(num + " Odd number");  //4. Otherwise , it prints:
        }

    }
}
/*
    Write  a method which can identifies given number is even or odd
        EX:
        identify(5) ->  "Odd"
        identify(6) ->  "Even"

     */