package uliana.week10_tasks;

import java.util.ArrayList;

public class List_Sort_Asc {

    /*
    ArrayList - sorting in ascending
Write a method that can sort the ArrayList in Ascending order without using
the sort method.

     */
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(2);
        numbers.add(8);
        numbers.add(1);
        numbers.add(3);

        sortAscending(numbers);

        System.out.println("Sorted ArrayList: " + numbers);
    }

    public static void sortAscending(ArrayList<Integer> list) {
        int n = list.size();
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (list.get(j) < list.get(minIndex)) {
                    minIndex = j;
                }
            }
            if (minIndex != i) {
                // Swap elements
                int temp = list.get(i);
                list.set(i, list.get(minIndex));
                list.set(minIndex, temp);
            }
        }
    }


}
