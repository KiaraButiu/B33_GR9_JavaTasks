package uliana.week7_tasks;

public class Array_FindMinimum {

    /*
    Write a function that can find the minimum number from an int Array
     */
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int minValue = getMinValue(array);
        System.out.println(minValue);
    }
    public static int getMinValue(int[] array) {
        int minValue = array[0]; // Initialize with the first element
        for (int i = 1; i < array.length; i++) {
            if (array[i] < minValue) {
                minValue = array[i];
            }
        }
        return minValue;
    }







}