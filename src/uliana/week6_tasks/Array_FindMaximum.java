package uliana.week6_tasks;

public class Array_FindMaximum {
    /*
        Write a function that can find the maximum number from an int Array
     */
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 10, 7, 8, 9};
        System.out.println(getMaxValue(array));
    }
   // iterate through the array and keep track of the maximum value encountered
    public static int getMaxValue(int[] array) {
        int maxValue = array[0]; // Initialize with the first element
        for (int i = 1; i < array.length; i++) {
            if (array[i] > maxValue) {
                maxValue = array[i];
            }
        }
        return maxValue;
    }


}
