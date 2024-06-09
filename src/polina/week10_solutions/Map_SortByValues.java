package polina.week10_solutions;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Map_SortByValues {
      /*
        Write a method that can sort the map by values
     */
  public static Map<String,Integer> sortByValue(Map<String, Integer> map){
      //The method takes a map with String keys and Integer values as a parameter
      List<Map.Entry<String,Integer>> entries = new ArrayList<>(map.entrySet());
      //Creates a list to store the entries of the map = new ArrayList<>(map.entrySet())- Converts the map's entries (key-value pairs) into a list

      for (int i = 0; i < entries.size(); i++) {                                   // Outer loop to go through the list
          for (int j = 0; j < entries.size() -1 ; j++) {                           // Inner loop to compare adjacent entries
              if (entries.get(j).getValue() > entries.get(j+1).getValue()){        //Checks if the current entry's value is greater than the next entry's value.
                  Map.Entry<String,Integer> temp = entries.get(j);                 // Temporarily stores the current entry
                  entries.set(j,entries.get(j+1));                                 // Swaps the current entry with the next entry
                  entries.set(j+1,temp);                                           // Places the temporarily stored entry in the next position
              }
          }
      }
      Map<String,Integer> sorted = new LinkedHashMap<>();                          // Creates a new linked hash map to maintain the order of entries
      for (Map.Entry<String, Integer> each : entries) {                            // Iterates over the sorted list of entries
          sorted.put(each.getKey(),each.getValue());                               // Adds each entry to the new linked hash map
      }
      return sorted;                                                               // Returns the sorted map
  }

    public static void main(String[] args) {
        Map<String,Integer> map = Map.of("b",1,"a",4,"n",2,"z",0,"p",3,"l",1,"e",2,"i",1);
        // Creates a map with some key-value pairs
        System.out.println(sortByValue(map));
        //Prints the sorted map returned by sortByValue
    }

}
