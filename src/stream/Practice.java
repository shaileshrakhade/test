package stream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Practice {
    public static void main(String[] args) {
        List<String> list=new ArrayList<>();
        list.add("i");
        list.add("i");
        list.add("ove");
        Map<String, Long> map;
        map=list.stream().collect(Collectors.groupingBy(o -> o,Collectors.counting()));
        System.out.println(map);
    }
}
