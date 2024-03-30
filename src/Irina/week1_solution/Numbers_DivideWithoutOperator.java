package Irina.week1_solution;

public class Numbers_DivideWithoutOperator { // my goal make the method visible. 

    public static int divide(int dividend, int divisor) {
        int quotient = 0;

        while (dividend >= divisor) {
            dividend -= divisor;
            quotient++;
        }

        return quotient;
    }

    public static void main(String[] args) {
        int dividend = 20;
        int divisor = 4;

        int quotient = divide(dividend, divisor);
        System.out.println("Quotient: " + quotient);
    }

}


