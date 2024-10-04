package stream;

import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Stream1 {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("i");
        list.add("i");
        list.add("ove");
        list.add("Apple");
        list.add("Banana");
        list.add("Banana");

        //count of duplicate string in list
        Map<String, Long> map;
        map = list.stream().collect(Collectors.groupingBy(o -> o, Collectors.counting()));
        System.out.println(map);

        //highest length of a string form a list
        System.out.println(list.stream().map(String::length).max(Integer::compare).orElse(0));

        //count of char occurrence in list
        System.out.println(list.stream()
                .flatMapToInt(String::chars)
                .mapToObj(value -> (char) value)
                .collect(Collectors.groupingBy(character -> character,Collectors.counting()))
                .entrySet().stream().sorted(Collections.reverseOrder(Map.Entry.comparingByKey())).toList()
        );

    }
}
