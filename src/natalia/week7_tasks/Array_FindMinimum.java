package natalia.week7_tasks;

public class Array_FindMinimum {

    /*
    Write a function that can find the minimum number from an int Array
     */
    public static void main(String[] args) {

        int[] arr = {3, 6, 8, 4, 5};

        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println(min);
    }
}








