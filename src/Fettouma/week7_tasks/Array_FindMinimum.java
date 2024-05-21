
package Fettouma.week7_tasks;

public class Array_FindMinimum {


    public static int findMin(int[] array) {


    int min = array[0];   // Initialize the minimum value to the first element of the array


        for (int i = 1; i < array.length; i++) {   // Iterate through the array

        if (array[i] < min) {   // If the current element is less than the current minimum, reassign  the minimum value
            min = array[i];
        }
    }

        return min;   // Return the found minimum value
}

public static void main(String[] args) {

    int[] array = {3, 5, 7, 2, 8, -15, 4, -8, 0};
    int min = findMin(array);
    System.out.println("The minimum value in the array is: " + min);
}
}



















    /*
    Write a function that can find the minimum number from an int Array
     */







