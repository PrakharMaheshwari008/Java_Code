package Coding_Interview;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class SortUsingMapStreamApi {
    public static void main(String[] args) {
        Map<String, Integer> map  = new HashMap<>();
        map.put("a",5);
        map.put("b",3);
        map.put("c",4);
        System.out.println("Map Before Sorting");
        System.out.println(map);
        LinkedHashMap<String,Integer> sorted = map.entrySet().stream().sorted((e1,e2)->{
            return e1.getValue()-e2.getValue();
        }).collect(Collectors.toMap(Map.Entry::getKey,Map.Entry::getValue,(e1,e2)->e1,LinkedHashMap::new));

        System.out.println("Map is Sorting");
        System.out.println(sorted);
    }
}
