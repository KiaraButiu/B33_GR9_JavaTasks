package greg.week1_solution;
public class Numbers_DivideWithoutOperators {

    /*
  Write a method that can divide two numbers without using division operator
 */
    public static void main(String[] args) {
        int dividend = 20;
        int divisor = 4;
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



