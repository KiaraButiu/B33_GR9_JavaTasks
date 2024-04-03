package kiara.week2_solution;

public class Number_SwapTwoNumbers {

    public static void main(String[] args) {
        swapTwoNumbers(-100,98654);


    }

    public static void swapTwoNumbers(int num1, int num2){
                                             // num1 = 10    num2 = 4
        num1 = num1 + num2;                  // num1 = 10 + 4 --> num1 = num1 + num2
        num2 = num1 - num2;                  // num1 = 14    num2 = 4
        num1 = num1 - num2;                  // num2 = 14 - 4 --> num2 = num1 - num2
                                             // num2 = 10    num1 = 14
                                             // num1 = 14 - 10 --> num1 = num1 - num2
                                             // num1 = 4   num2 = 10

        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);
    }
}

   /*
    Swap two variable values without using a third variable
     */
