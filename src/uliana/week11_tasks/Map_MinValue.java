package uliana.week11_tasks;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
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
//
//        System.out.println(minimum(map));

    }

    public static int minValue(Map<String, Integer> map) {

        List<Map.Entry<String, Integer>> entries = new ArrayList<>(map.entrySet());
        int minValue = entries.get(0).getValue();
        for (int i = 0; i < entries.size(); i++) {
            if (entries.get(i).getValue() < minValue) {
                minValue = entries.get(i).getValue();
            }

        }

        return minValue;


    }
}



