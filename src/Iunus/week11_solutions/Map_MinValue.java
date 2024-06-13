package Iunus.week11_solutions;

import java.util.LinkedHashMap;
import java.util.Map;

public class Map_MinValue {

    public static void main(String[] args) {
        Map<String, Integer> map = new LinkedHashMap<>();
        map.put("k0", -1);
        map.put("k5", 5);
        map.put("k2", 2);
        map.put("k1", -3);
        map.put("k3", 3);



    /*
    Write a method that can return the minimum value from a map (DO NOT use sort method)
     */


        System.out.println("Minimum value: " + minValue(map));
    }

    public static int minValue(Map<String, Integer> map) {

        int min = Integer.MAX_VALUE;
        for (Integer value : map.values()) {
            if (value < min) {
                min = value;
            }
        }
        return min;
    }
}
