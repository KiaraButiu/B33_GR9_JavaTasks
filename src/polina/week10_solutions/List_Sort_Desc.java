package polina.week10_solutions;

import java.util.ArrayList;

public class List_Sort_Desc {
    /*
ArrayList - sorting in descending order
Write a method that can sort the ArrayList in descending order without
using the sort method.
     */
    public static void sortDescending(ArrayList<Integer> list) {
        // method named sortDescending that takes an ArrayList of Integer objects as its parameter
        // this method will sort the given list in descending order
        int n = list.size();
        //this line declares an integer n and assigns it the size of the list
        // the size() method returns the number of elements in the list
        for (int i = 0; i < n - 1; i++) { //the outer loop controls the number of passes over the list
            // since each pass places the next largest element at the end of the unsorted portion
            for (int j = 0; j < n - 1 - i; j++) {
                //the inner loop compares each pair of adjacent elements and swaps them if they are out of order
                // the -i part reduces the range of the inner loop with each pass, as the last i elements are already sorted
                if (list.get(j) < list.get(j + 1)) { //this if statement checks if the current element is less than the next element
                    // list.get(j) retrieves the element at index j and list.get(j + 1) retrieves the element at index j + 1
                    // Swap list[j] and list[j + 1]
                    int temp = list.get(j);
                    // this line declares an integer temp and assigns it the value of the current element list.get(j)
                    // this temporary variable is used to swap the elements
                    list.set(j, list.get(j + 1));
                    //this sets the current element to the value of the next element
                    // list.set(j, value) sets the element at index j to value
                    list.set(j + 1, temp);
                    //this sets the next element to the value stored in temp, completing the swap
                }
            }
        }
    }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        //this creates a new ArrayList of Integer objects and assigns it to the variable list
        list.add(3);
        //these lines add elements to the list using the add method
        // each call to add inserts an element at the end of the list
        list.add(1);
        list.add(4);
        list.add(1);
        list.add(5);
        list.add(9);
        list.add(2);
        list.add(6);
        list.add(5);

        System.out.println("Before sorting: " + list);
        sortDescending(list);//this calls the sortDescending method to sort the list in descending order
        System.out.println("After sorting: " + list); //this prints the list after sorting to the console
    }
}
