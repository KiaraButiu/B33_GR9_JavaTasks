package sam.week8_solutions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Array_MoveAllZerosToTheEnd {
    /*
    write a program that can move all the zeros to the end of an array
     */

    public static void main(String[] args) {
        int[] array = {0,9, -8, 0, 4, 0, -13};
        int[] completed = moveZeros(array);
        System.out.println("completed = " + Arrays.toString(completed));
    }

    public static int[] moveZeros( int[] array){
        List<Integer> numbers = new ArrayList<>();
        List<Integer> zeros = new ArrayList<>();
        for (int each : array) {
            if (each == 0 ){
                zeros.add(each);
            } else {
                numbers.add(each);
            }
        }
        numbers.addAll(zeros);
        for (int i = 0; i < array.length; i++) {
            array[i] = numbers.get(i);
        }

        return array;

    }

}
