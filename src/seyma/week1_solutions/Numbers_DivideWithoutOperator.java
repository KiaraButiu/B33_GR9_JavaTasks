package seyma.week1_solutions;

public class Numbers_DivideWithoutOperator {

      /*
    Write a method that can divide two numbers without using division operator
     */

    public static void main(String[] args) {
        divisionWithoutOperator(60, 30);
    }

    public static void divisionWithoutOperator(int num1, int num2){

        int count=0;
        while (num1>=num2){
            count++;
            num1-=num2;
        }
        System.out.println(count);
    }

}
