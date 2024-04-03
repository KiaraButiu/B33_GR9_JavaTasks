package alena.week2_solutions;

public class Number_SwapTwoNumbers {


    public static void main(String[] args) {

        int a = 8;
        int b = 3;

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}
