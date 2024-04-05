package uliana.week2_solutions;

public class Number_SwapTwoNumbers {
    public static void main(String[] args) {
        int x = 11;
        int y = 22;
        System.out.println("Before Swapping");
        System.out.println("Value of x is: " + x);
        System.out.println("Value of y is: " + y);

        x = x + y; //x=22+11=33
        y = x - y; //y=33-22=11
        x = x - y; //x=33-11=22

        System.out.println("After Swapping");
        System.out.println("Value of x is: " + x);
        System.out.println("Value of y is: " + y);
    }

    /*
    Swap two variable values without using a third variable
     */


    }






