package Fettouma.week7_tasks;

public class Array_SortInDescendingOrder {
    public static void SortInDescendingOrder(int[] array){

        for (int i = 0; i < array.length -1; i++) {  // we will  pass through the array enough times to sort it.

            for (int j = 0; j < array.length-1-i; j++) {  // Go through the array and n-1-i times to avoid unnecessary comparisons
                // with already sorted elements at the end of the array.

                if (array[j] < array[j + 1]) {   // If the current element is less  than the next element, swap them
                    //
                    int temp = array[j]; // to Swap the elements we will creat temporary variable to swap or switch the values
                    array[j] = array[j + 1]; //swaps the two elements.
                    array[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {

        int[] array = {5, 1, 4, 2, 8,22};

        // Call the  method to sort the array
        SortInDescendingOrder(array);

        // Print the sorted array
        System.out.println("Sorted array:");
        for (int num : array) {
            System.out.print(num + " ");
        }
    }





}

    /*
        Write a return method that can sort an int array in descending order without using the sort method
     */


