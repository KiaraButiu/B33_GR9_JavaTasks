package Fettouma.Week2_Solutions;

public class Number_SwapTwoNumbers {

    public static void main(String[] args) {
        int a = 10;
        int b = 20;
     swap(a,b);


    }
    public static void swap(int a, int b){
       a = a+b;
      b=a-b;
      a=a-b;

        System.out.println("a = " + a);
        System.out.println("b = " + b);

    }
}
