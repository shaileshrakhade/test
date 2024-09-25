package oops;

import java.util.Arrays;
import java.util.List;

public class ReverseWord {
    //    Reverse a word(string) while maintaining the spaces in their original positions.
//    i/p. welcome to synechron
//    o/p. synechr on towelcome.
//
//    i/p. i love pune
//    o/p. p unel ovei.
    public static void main(String[] args) {
        System.out.println("I love pune :: " + reversStringWithSameSpacePosition("I love pune"));//e nupe voli
        System.out.println("I love pune :: " + reversWordWithSameSpacePosition("I love pune"));
    }

    static String reversStringWithSameSpacePosition(String s) {
        char[] chars = s.toCharArray();
        char[] result = new char[chars.length];
        //add space at there position
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == ' ')
                result[i] = ' ';
        }
        int j = chars.length - 1;
        for (char aChar : chars) {
            if (aChar != ' ') {
                if (result[j] == ' ')
                    j--;
                result[j] = aChar;
                j--;
            }
        }
        return String.valueOf(result);
    }

    static String reversWordWithSameSpacePosition(String s) {

        List<String> list = Arrays.stream(s.split(" ")).toList();
        char[] result = new char[s.length()];
        StringBuilder tempString = new StringBuilder();
        //add space at there position
        for (int i = 0; i < result.length; i++) {
            if (s.charAt(i) == ' ')
                result[i] = ' ';
        }
        //create new string by revers word
        for (int i = list.size() - 1; i >= 0; i--) {
            tempString.append(list.get(i));
        }

        int j = 0;
        for (int i = 0; i < result.length; i++) {

            //check if space then add char at next position
            if (result[i] == ' ')
                i++;

            //already add chat not add index maintained in j
            if (j < tempString.length()) {
                result[i] = tempString.charAt(j);
                j++;
            }
        }
        return String.valueOf(result);
    }
}
