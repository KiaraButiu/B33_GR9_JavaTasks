package polina.week11_solutions;

import java.util.LinkedHashMap;
import java.util.Map;

public class Map_MinValue {
      /*
    Write a method that can return the minimum value from a map (DO NOT use sort method)
     */
    public static void main(String[] args) {
        Map<String, Integer> map = new LinkedHashMap<>();
        map.put("k0", -1);
        map.put("k5", 5);
        map.put("k2", 2);
        map.put("k1", -3);
        map.put("k3", 3);
        System.out.println(minValue(map));

    }
    public static int minValue(Map<String, Integer> map) {
        int min = Integer.MAX_VALUE;
// Loop through all the values in the map. The 'map values()' method returns a collection of all the values stored in the map.
        for (Integer value : map.values()) {
// Check if the current value is less than 'min'. If it is, we update 'min' with this new lower value.
            if (value < min) {
                min = value;
            }
        }
        return min;
    }
}
