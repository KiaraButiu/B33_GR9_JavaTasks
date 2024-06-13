package Iunus.week9_solutions;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class List_RemoveNumbers {
    /*
    Given a list of Integers 1, 2, 3, 4, 5, 6 ....etc. remove all values greater than 100.
     */
    public static void main(String[] args) {
        List<Integer> list = randomGenerated(10, 40, 150);
        System.out.println(list);
        List<Integer> finalList = removeNumbers(list);
        System.out.println(finalList);
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

    public static List<Integer> removeNumbers (List<Integer> list){
        list.removeIf(l -> l > 100);
        return list;
    }
}
