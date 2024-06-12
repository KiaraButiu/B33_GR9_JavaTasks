package sam.week10_solutions;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class List_Sort_Desc {

     /*
ArrayList - sorting in descending order
Write a method that can sort the ArrayList in descending order without
using the sort method.
     */

    public static void main(String[] args) {
        List<Integer> randomList = randomGenerated(5, 1, 10);
        System.out.println(randomList);
        System.out.println("ascendingSort(randomList) = " + ascendingSort(randomList));

    }

    public static List<Integer> randomGenerated( int size, int min, int max){
        Random random = new Random();
        List<Integer> customList = new ArrayList<>();

        for (int i = 0; i < size; i++) {
            int randomNum = random.nextInt(max - min) + min;
            customList.add(randomNum);
        }

        return customList;
    }

    public static List<Integer> ascendingSort(List<Integer> randomList) {

        int size = randomList.size();
        for (int i = 0; i < size - 1; i++) {
            for (int j = 0; j < size - 1 - i; j++) {
                if (randomList.get(j) < randomList.get(j + 1)) {
                    // Swap list[j] and list[j + 1]
                    int temp = randomList.get(j);
                    randomList.set(j, randomList.get(j + 1));
                    randomList.set(j + 1, temp);
                }
            }
        }
        return randomList;
    }
}
