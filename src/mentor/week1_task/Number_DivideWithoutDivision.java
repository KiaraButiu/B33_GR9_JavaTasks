package mentor.week1_task;

public class Number_DivideWithoutDivision {

    /*
    Write a method that can divide two numbers without using division operator
     */

    public static void divide(int num1, int num2) {
        if (num2 == 0) {
            System.err.println("Invalid Number");

        }

        int count = 0;
        while (num1 >= num2) {
            num1 -= num2;
            count++;
        }
        System.out.println(count + " and remainder is " + num1);
    }


}
