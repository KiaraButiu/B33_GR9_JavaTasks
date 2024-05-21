package kiara.week6_solution;

public class Array_FindMaximum {

    public static void main(String[] args) {
        int[] numbers = {10,20,30,40,50};

        System.out.println(maxNum(numbers));

    }

    public static int maxNum (int[] arrayNum){
        int max = arrayNum[0];           // first, initialize max variable with the first element of array [0]

        for (int eachNum : arrayNum) {      // This loop will iterate through each element of the given array
            if (eachNum > max){                 // this compares the value of each element of the array with
                                                    // the current maximum value.
                max = eachNum;                  // if the current value is equal to the max number, it updates the max variable value
            }
        }
        return max;                             // in the end, it will return the maximum number
    }
}
/*
        Write a function that can find the maximum number from an int Array
     */