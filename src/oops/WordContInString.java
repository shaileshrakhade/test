package oops;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class WordContInString {
    public static void main(String[] args) {

        String str = "string with any para para para any para";

        String[] strarr = str.split(" ");
        Map<String, Integer> list = new HashMap<>();
        System.out.println(Arrays.toString(Arrays.stream(strarr).toArray()));
        for (String s : strarr) {

            if(list.get(s) != null && list.get(s)>0)
            {
                list.put(s, list.get(s)+1);
            }else {
                list.put(s, 1);
            }

        }
        System.out.println(list);
    }
}
