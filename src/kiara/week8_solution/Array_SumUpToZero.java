package kiara.week8_solution;

import javax.sound.midi.Soundbank;
import java.util.Arrays;

public class Array_SumUpToZero {

    public static void main(String[] args) {
        int N = 4;
        int[] result = sumToZero(N);

        System.out.println("Array for N: " + N);
        System.out.println(Arrays.toString(result));



    }

      /*
    Write a function:
        that, given an integer N (1 < N < 100), returns an array containing N unique integers that sum up to 0.
        The function can return any such array.
        For example, given N = 4, the function could return [1,0, -3,2] or [-2,1, -4,5].
        The answer [1, -1,1,3] would be incorrect (because value 1 occurs twice).
        For N = 3 one of the possible answers is [-1,0,1] (but there are many more correct answers).
     */

    public static int[] sumToZero(int N){

        int[] total = new int[N];               // 'total' array with size of 'N' will store the result

        int sum = 0;                            //  'sum' variable will keep track of the sum of the elements added to array
        for (int i = 0; i < N -1 ; i++) {       // Loop through first 'N-1' element
            total[i] = i + 1;                   // assign each element a unique integer starting at 1
            sum += total[i];                    // accumulate the sum of integer
        }
        total[N - 1] = -sum;                    //Assign the accumulated sum to negative -> the total of the array will be 0


        return total;
    }


}
