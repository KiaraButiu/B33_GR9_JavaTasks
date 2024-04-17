package greg.week2_solution;

public class Number_ConsecutiveNumbers {

    public static void main(String[] args) {


        int number = 24;

        for (int i = 0; i <= number; i++) {    // Creating a "for" loop wich started from 0 and ends at the given number.

            String word = "";                  // String variable to store "words"

            if (i % 2 == 0) {                  // if condition is TRUE each word will be printed
                word += "Codility";
            }
            if (i % 3 == 0) {
                word += "Test";
            }
            if (i % 5 == 0) {
                word += "Coders";
            }
            if (i % 2 != 0 && i % 3 != 0 && i % 5 != 0) {          // if "i" value is NOT divisible by 2, 3, and 5
                word += i;                                         // word will be the "i" value
            }

            System.out.println(word);
        }
    }

}

   /*
    Write a function:
    that, given a positive integer N, prints the consecutive numbers from 1 to N, each on a separate line.
    However, any number divisible by 2, 3 or 5 should be replaced by the word Codility, Test or Coders respectively.
    If a number is divisible by more than one of the numbers: 2,3 or 5, it should be replaced by a concatenation of the
    respective words Codility, Test and Coders in this given order.
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