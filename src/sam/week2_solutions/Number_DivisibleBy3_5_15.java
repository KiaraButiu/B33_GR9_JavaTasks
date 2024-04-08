package sam.week2_solutions;


import java.util.ArrayList;



public class Number_DivisibleBy3_5_15 {

    public static void divisibleList(int number){   //Creating a custom method that takes any number as argument
        ArrayList<Integer> divisibleBy15 = new ArrayList<>();  //Creating three different ArrayList to store numbers
                                                               // that will meet a certain condition
        ArrayList<Integer> divisibleBy3 = new ArrayList<>();
        ArrayList<Integer> divisibleBy5 = new ArrayList<>();

        for (int i = 1; i <= number ; i++) { //Iterating through each number and checking condition
            if (i%3==0 && i%5==0 && i%15==0){
                divisibleBy15.add(i); //adding number to this ArrayList divisibleBy15 if condition is true
            } else if (i%3==0) {
                divisibleBy3.add(i); //adding number to this ArrayList divisibleBy3 if condition is true
            } else if (i%5==0) {
                divisibleBy5.add(i); //adding number to this ArrayList divisibleBy5 if condition is true
            } else {
                continue; // skipping numbers that didn't meet any conditions
            }
        }
        System.out.println("Divisible By 15: " + divisibleBy15); // print statements for each ArrayList
        System.out.println("Divisible By  3: " + divisibleBy3);
        System.out.println("Divisible By  5: " + divisibleBy5);


    }

    public static void main(String[] args) { // Main method to test and verify that logic of the method works properly
        divisibleList(150);
    }

    /*
    Write a program that can print the numbers between 1 ~ N that can be divisible by 3, 5, and 15.
            if the number can be divisible by 3, 5 and 15,
                then it should only be displayed in DivisibelBy15' section

            if the number can be divisible by 3 but cannot be divisible by 15,
                then it should only be displayed in DivisibelBy3' section

            if the number can be divisible by 5 but cannot be divisible by 15,
                then it should only be displayed in DivisibelBy5' section

        EX:
            input: 100

            Output:
                 Divisible By 15 15 30 45 60 75 90
                 Divisible By 5 5 10 20 25 35 40 50 55 65 70 80 85 95 100
                 Divisible By 3 3 6 9 12 18 21 24 27 33 36 39 42 48 51 54 57 63 66 69 72 78 81 84 87 93 96 99

    */
}
