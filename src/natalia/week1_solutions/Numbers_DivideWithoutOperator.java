package natalia.week1_solutions;

public class Numbers_DivideWithoutOperator {
    public static void main(String[] args) {

        DivideTwoNumbers(27,5);                 //8. Calling the method with two argument
    }
    public static void DivideTwoNumbers(int num1, int num2){  //1. Create method with two integer parameters
        int quotient = 0;                       //2. Initialize variables quotient (to store the quotient)
        int remainder = 0;                      //3. Initialize variables remainder (to store the remainder after division).

        while (num1 >= num2) {                  //4. The while loop runs as long as num1 is greater than or equal to num2.
            num1 -= num2;                       //5. num1 is decremented by num2 use subtraction assignment operator.
            quotient++;                         //6. quotient is incremented by 1.
        }
        remainder = num1;                       //7. After the loop, we assign the value of num1 to remainder.

        System.out.println(quotient + " with a reminder of " + remainder);
    }
}
  /*
    Write a method that can divide two numbers without using division operator
------------------------------------------------------------------------------
 Example:  27 : 5 = 5 remain 2

    Output: 5 with a reminder of 2
_______________________________________________________________________________
   Solution of our task.
   num1 = 27 - dividend. Dividend is number being divided.
   num2 =  5 - divisor. Divisor is the number by which the dividend is divided.
   quotient = 5 - result  of division operation. Number of times can be divisor (5)
   subtracted from dividend (27)
   remainder = 2

   27 - 5 - 5 - 5 - 5 - 5 = 2;

  */

