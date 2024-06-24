package uliana.week9_tasks;

import java.util.ArrayList;
import java.util.Arrays;

public class Remove {
    public static void main(String[] args) {


        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9));
        list.addAll(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9));
        list.addAll(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9));
        //                        0 1 2 3 4 5 6 7 8


        System.out.println("Before remove() method" + list);

        for (int i = list.size()-1; i >=0; i--) {
            if (list.get(i) % 2 != 0) {
                list.remove(i);// normally it must remove all odd numbers, BUT will not
                // we can not use remove() method to remove an element of an ArrayList in a loop
                // since ArrayList size is dynamic. We must use Iterable or removeIf() instead

            }
        }
        System.out.println("After remove() method" + list);
    }
}
