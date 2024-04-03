package sam.week2_solutions;

public class Number_ConsecutiveNumbers {
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_RED = "\u001B[31m";

    public static void consecutiveNumbers(int number){
        for (int i = 1; i <= number ; i++) {                    //Creating for loop to get each number one-by-one
            if (i %2 ==0 && i %3 ==0 && i %5 ==0){              //Checking each of these numbers for the first proper condition
                System.out.println(ANSI_RED + "CodilityTestCoders" + ANSI_RESET);
            } else if (i %2 ==0 && i %3 ==0) {
                System.out.println("CodilityTest");
            } else if (i %2 ==0 && i %5 ==0) {
                System.out.println("CodilityCoders");
            } else if (i %3 ==0 && i %5 ==0) {
                System.out.println("TestCoders");
            } else if (i%2 ==0 ){
                System.out.println("Codility");
            } else if (i%3 ==0 ){
                System.out.println("Test");
            } else if (i%5 ==0 ) {
                System.out.println("Coders");
            } else {
                System.out.println(i);                       //simply printing a number - In case if our number didn't meet any condition
            }
        }
    }

    public static void main(String[] args) {    //Main method to test our custom method
        consecutiveNumbers(60);
    }

     /*
    Write a function:
    that, given a positive integer N, prints the consecutive numbers from 1 to N, each on a separate line.
    However, any number divisible by 2, 3 or 5 should be replaced by the word Codility, Test or Coders respectively.
    If a number is divisible by more than one of the numbers: 2,3 or 5, it should be replaced by a concatenation of the respective words Codility, Test and Coders in this given order.
    For example, numbers divisible by both 2 and 3 should be replacée by CodilityTest and numbers divisible by all
    three numbers: 2,3 and 5, should be replaced by CodilityTestCoders.

        For example, here is the output for N = 24:
                                    1
                                    Codility
                                    Test
                                    Codility
                                    Coders
                                    CodilityTest
                                    7
                                    Codility
                                    Test
                                    Codi1ityCoders
                                    11
                                    CodilityTest
                                    13
                                    Codility
                                    TestCoders
                                    Codility
                                    17
                                    ....
     */
}