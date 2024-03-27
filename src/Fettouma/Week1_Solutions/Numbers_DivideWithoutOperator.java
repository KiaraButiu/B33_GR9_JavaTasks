package Fettouma.Week1_Solutions;

public class Numbers_DivideWithoutOperator {

    public static void main(String[] args) {
      DivideWithoutOperator(21,5);
    }
  public static void DivideWithoutOperator(double num1, double num2){

      double rest=0;
    double count = 0;

        while (num1 >= num2){
        num1 -= num2;
        count++;

    }
      System.out.println(count);
}
//
     /*
    Write a method that can divide two numbers without using division operator
     */
}
