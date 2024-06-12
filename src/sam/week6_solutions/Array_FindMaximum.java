package sam.week6_solutions;


import java.util.Arrays;

public class Array_FindMaximum {

    /*
        Write a function that can find the maximum number from an int Array
     */
    public static void main(String[] args) {

        int[] randomArray = {-10, -3, -120, -34, -89, -1, 0};

        System.out.println(maximumNumber(randomArray));



    }

    public static int maximumNumber(int[] randomArray){
        int max;
        max = randomArray[0];
        for (int i = 0; i < randomArray.length; i++) {
           if (randomArray[i] > max){
               max = randomArray[i];
           }
        }
        return max;
    }
}
