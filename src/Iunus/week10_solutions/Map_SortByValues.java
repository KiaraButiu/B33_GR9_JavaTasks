package Iunus.week10_solutions;

import java.util.*;

public class Map_SortByValues {
    /*
        Write a method that can sort the map by values
     */
    public static void main(String[] args) {
        Map<String, Integer> unsortedMap = new HashMap<>();
        unsortedMap.put("Salary_Mike", 50_000);
        unsortedMap.put("Salary_Bob", 100_000);
        unsortedMap.put("Salary_Chris", 20_000);
        unsortedMap.put("Salary_Margo", 40_000);
        System.out.println("unsortedMap = " + unsortedMap);
        System.out.println("sortedMap(unsortedMap) = " + sortedMap(unsortedMap));
    }

    public static Map<String, Integer> sortedMap(Map<String, Integer> unsortedMap){
        List<Map.Entry<String, Integer>> entries = new ArrayList<>(unsortedMap.entrySet());
        System.out.println("entries = " + entries);
        for (int i = 0; i < entries.size(); i++) {
            for (int j = 0; j < entries.size(); j++) {
                if(entries.get(j).getValue() > entries.get(j+1).getValue()){

                    Map.Entry<String, Integer> tempVar = entries.get(j);
                    entries.set(j, entries.get(j+1));
                    entries.set(j+1, tempVar);
                }
            }
        }

        Map<String, Integer> sortedMap = new LinkedHashMap<>();

        for(Map.Entry<String, Integer> each : entries){
            sortedMap.put(each.getKey(), each.getValue());
        }

        return sortedMap;
    }
}
