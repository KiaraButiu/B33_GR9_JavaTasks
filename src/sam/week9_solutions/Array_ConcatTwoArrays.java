package sam.week9_solutions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Array_ConcatTwoArrays {
    /*
    Write a return method that can concat two arrays
     */
    public static void main(String[] args) {
        List<String> arrayList1 = new ArrayList<>(Arrays.asList("apple", "orange", "banana"));
        List<String> arrayList2 = new ArrayList<>(Arrays.asList("Beets", "Carrots", "Corn", "Potatoes"));
        System.out.println("NewArray " + concatTwoArrays(arrayList1, arrayList2));
    }

    public static List<String> concatTwoArrays (List<String> array1, List<String> array2){
        array1.addAll(array2);
        return array1;

    }
}
