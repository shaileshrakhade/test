package stream;

import java.util.*;
import java.util.stream.Collectors;

public class HighestSalaryHashMap {
//    find out the third highers salary with respect to name as well
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("Kiran", 50000);
        map.put("Kalam", 45000);
        map.put("Esa", 45000);
        map.put("Raheem", 35000);
        map.put("Chand", 35000);
        map.put("Abrar", 20000);

        Map.Entry<Integer, List<String>>
                entry = getNthHighestSalary(map, 3);
        System.out.println(entry);

    }

    public static Map.Entry<Integer, List<String>> getNthHighestSalary(Map<String, Integer> map, int n) {
        return map
                .entrySet().stream().collect(Collectors.groupingBy(Map.Entry::getValue,
                        Collectors.mapping(Map.Entry::getKey, Collectors.toList())))
                .entrySet()
                .stream().sorted(Collections.reverseOrder(Map.Entry.comparingByKey()))
                .toList().get(n-1);
    }
}
