package kiara.week1_solution;

public class Numbers_DivideWithoutOperator {
    public static void main(String[] args) {
        divideWithoutDivisionOp(20,4);

    }

    public static void divideWithoutDivisionOp(int num1, int num2){

        int count = 0;                  // initialize variable "count" to 0 to store the number of times num2 can be subtracted from num1

        while (num1 >= num2){           // We are using while loop since we do not know the number of iteration
                                                // Loop will continue as long as num1 is Greater than Or Equals to num2
            count++;                      // for each iteration the count will increase to 1
            num1 -= num2;                // num1 = num1 - num2 --> subtract num2 to num1
        }
        System.out.println(count);      // prints out the number of times num2 could be subtracted from num1
    }
}
 /*
    Write a method that can divide two numbers without using division operator
     */