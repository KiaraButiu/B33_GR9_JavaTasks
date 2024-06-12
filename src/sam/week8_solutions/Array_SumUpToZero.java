package sam.week8_solutions;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Array_SumUpToZero {
    /*
    Write a function:
        that, given an integer N (1 < N < 100), returns an array containing N unique integers that sum up to 0.
        The function can return any such array.
        For example, given N = 4, the function could return [1,0, -3,2] or [-2,1, -4,5].
        The answer [1, -1,1,3] would be incorrect (because value 1 occurs twice).
        For N = 3 one of the possible answers is [-1,0,1] (but there are many more correct answers).
     */

    //not done

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Provide your number");
        int Num = input.nextInt();
        int[] result = new int[Num];

        int sum = 0;

        for (int i = 1; i <= Num / 2; i++) {
            result[sum++] = i;
            result[sum++] = -i;
        }

        if (Num % 2 != 0) {
            result[sum] = 0;
        }

       

        System.out.println("result = " + Arrays.toString(result));
    }

}


