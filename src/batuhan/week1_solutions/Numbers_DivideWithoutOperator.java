package batuhan.week1_solutions;

public class Numbers_DivideWithoutOperator {
    /*
  Write a method that can divide two numbers without using division operator
   */


    public static void main(String[] args) {
        int dividend = 10;
        int divisor = 2;
        System.out.println(divide(dividend, divisor));
    }

    public static int divide(int dividend, int divisor) {
        int quotient = 0;
        while (dividend >= divisor) {
            dividend -= divisor;
            quotient++;
        }
        return quotient;
    }
}
