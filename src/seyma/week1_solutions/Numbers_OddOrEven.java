package seyma.week1_solutions;

import java.util.Scanner;

public class Numbers_OddOrEven {

    public static void main(String[] args) {

        oddOrEven(26);
    }
    public static void oddOrEven(int num){
        if (num%2==0){
            System.out.println("Even");
        }else {
            System.out.println("Odd");
        }
    }

    /*
    Write a method which can identifies given number is even or odd
        EX:
        identify(5) ->  "Odd"
        identify(6) ->  "Even"

     */


}
