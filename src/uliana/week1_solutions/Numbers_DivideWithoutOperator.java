package uliana.week1_solutions;

public class Numbers_DivideWithoutOperator {
    public static void main(String[] args) {

        int n1=100;   //Dividend
        int n2=6;     //Divisor
        int result=0; //Quotient

        while (n1 >= n2) {
            n1 -= n2;
            result++;
        }
        //or can do same with for loop
//        for (int i = 0; n1 >= n2; i++) {
//            n1 -= n2;
//            result++;
//        }
        int remainder= n1;

        System.out.println(result+" with a reminder of "+remainder);

    }
}
  /*
    Write a method that can divide two numbers without using division operator
     */