package seyma.week2_solutions;

public class Number_SwapTwoNumbers {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        System.out.println("Before Swapping");
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        a = a + b; //a will be holding the sum of a+b's values which is 30.
        b = a - b;//b will be holding the original value of 'a' now which is 10.
        a = a - b;//a now will be holding the original value of 'b' which is 20.

        System.out.println("After Swapping");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
    /*
    Swap two variable values without using a third variable
     */


    }






