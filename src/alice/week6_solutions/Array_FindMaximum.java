package alice.week6_solutions;

public class Array_FindMaximum {
    /*
        Write a function that can find the maximum number from an int Array
     */

    public static void main(String[] args) {
        int[] numbers = {5, 3, 9, 2, 7};
        System.out.println("Maximum number: " + findMax(numbers));
    }

    public static int findMax(int[] arr) {
        int max = arr[0]; // Assume the first element as the maximum
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i]; // Update the maximum if a larger number is found
            }
        }
        return max;
    }


}
