package greg.week2_solution;

public class Number_SwapTwoNumbers {

    public static void main(String[] args) {

        int a = 4;
        int b = 8;

        System.out.println("Before swapping: ");
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        //Before swapping:
        //a = 4
        //b = 8

        //Swapping without using a third variable
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;

        System.out.println("After swapping: ");
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        //After swapping:
        //a = 8
        //b = 4
    }
}

 /*
    Swap two variable values without using a third variable
     */
