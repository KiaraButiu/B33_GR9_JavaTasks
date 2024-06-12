package uliana.week9_tasks;

public class Array_ConcatTwoArrays {

    /*
    Write a return method that can concat two arrays
     */
    public static void main(String[] args) {
        // Example usage
        int[] array1 = { 1, 2, 3 };
        int[] array2 = { 4, 5, 6 };

        int[] concatenatedArray = concatenateArrays(array1, array2);

        // Print the concatenated array
        for (int value : concatenatedArray) {
            System.out.print(value + " ");
        }
    }

    public static int[] concatenateArrays(int[] arr1, int[] arr2) {
        int len1 = arr1.length;
        int len2 = arr2.length;
        int[] result = new int[len1 + len2];

        // Copy elements from arr1 to result
        for (int i = 0; i < len1; i++) {
            result[i] = arr1[i];
        }

        // Copy elements from arr2 to result
        for (int i = 0; i < len2; i++) {
            result[len1 + i] = arr2[i];
        }

        return result;
    }


}
