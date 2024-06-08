package uliana.week9_tasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class List_RemoveNumbers {

    /*
    Given a list of Integers 1, 2, 3, 4, 5, 6 ....etc. remove all values greater than 100.
     */
    public static void main(String[] args) {


        List<Integer> numbers = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,100,105, 200, 350));
       // numbers.removeIf(n->n>100);
        for (int i =numbers.size()-1; i >=0; i--) {
            if(numbers.get(i)>100){
                numbers.remove(i);
            }
        }
        System.out.println(numbers);

    }
    //we iterate through the list in reverse order to avoid issues with index shifting when removing elements

}
