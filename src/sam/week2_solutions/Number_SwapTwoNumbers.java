package sam.week2_solutions;

public class Number_SwapTwoNumbers {

    /*
    Swap two variable values without using a third variable
     */
    public static void swapNumbers (int num1, int num2){
        int x = num1; // assigning num1 to variable
        int y = num2; // assigning num2 to variable
        y = x + y;    // num2 = num1 + num2;   num2 = 10 + 20;  num2 = 30
        x = y - x;    // num1 = num2 - num1;  num1 = 30 - 10; num1 = 20;
        y = y - x ;   // num2 = num2 - num1;  num2 = 30 - 20; num2 =10;
        System.out.println("Num1 = " + x + " , and Num2 = " + y);
    }

    public static void main(String[] args) { //Main method to test that logic of this method works properly
        swapNumbers(10,20);
    }

}
