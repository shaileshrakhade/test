import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("apple", "banana", "orange"
                , "grape");

        System.out.println(strings.stream().filter(x->x.contains("a")).count());




    }
}
