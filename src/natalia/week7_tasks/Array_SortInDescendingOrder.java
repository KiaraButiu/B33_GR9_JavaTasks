package natalia.week7_tasks;

public class Array_SortInDescendingOrder {
    /*
        Write a return method that can sort an int array in descending order without using the sort method
     */
    public static void main(String[] args) {
        int[] arr = {3, 6, 8, 4, 5};
        for (int i = 0; i < arr.length ; i++) {
            for (int j = i; j < arr.length; j++) {
                if (arr[j] > arr[i]){
                    int temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }

    }




}
