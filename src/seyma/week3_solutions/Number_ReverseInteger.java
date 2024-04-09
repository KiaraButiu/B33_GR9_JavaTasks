package seyma.week3_solutions;

public class Number_ReverseInteger {

    public static void main(String[] args) {

        System.out.println(reverseNegativeNumber(-6));
    }
    public static int reverseNegativeNumber(int num){
        if (num>=0){ //if the given number is positive return it as it is.
            return num;
        }
        return num/-1; //if the given number is negative, divide it by -1 then it will return as positive.
    }

/*
Write a return method that can reverse
negative number and return it as int
 */



}
