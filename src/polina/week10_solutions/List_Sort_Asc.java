package polina.week10_solutions;

import java.util.ArrayList;

public class List_Sort_Asc {
      /*
    ArrayList - sorting in ascending
Write a method that can sort the ArrayList in Ascending order without using
the sort method.

     */
    public static void sortAscending(ArrayList<Integer> list) {
        //declares a static method named sortAscending that takes an ArrayList of Integer objects as its parameter
        // this method will sort the given list in ascending order
        int n = list.size(); //declares an integer n and assigns it the size of the list
        for (int i = 0; i < n - 1; i++) {
            //The outer loop, controlling the number of passes over the list
            for (int j = 0; j < n - 1 - i; j++) {
                //the inner loop, comparing each pair of adjacent elements
                if (list.get(j) > list.get(j + 1)) {
                    //the if statement checks if the current element is greater than the next element
                    // Swap list[j] and list[j + 1]
                    int temp = list.get(j);
                    //these lines store the current element in a temporary variable, swap the current element with the next element,
                    // and then place the temporary variable's value in the next element's position
                    list.set(j, list.get(j + 1));
                    list.set(j + 1, temp);
                }
            }
        }
    }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        //creates a new ArrayList of Integer objects and adds elements to it
        list.add(3);
        list.add(1);
        list.add(4);
        list.add(1);
        list.add(5);
        list.add(9);
        list.add(2);
        list.add(6);
        list.add(5);

        System.out.println("Before sorting: " + list); //prints the list before sorting
        sortAscending(list); //calls the sortAscending method to sort the list in ascending order
        System.out.println("After sorting: " + list); //prints the list after sorting
    }

}
