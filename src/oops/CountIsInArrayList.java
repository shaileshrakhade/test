package oops;

import java.util.ArrayList;

public class CountIsInArrayList {
    //find out total IS occurrence in all strings
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<String>();
        cars.add("This is an apple");
        cars.add("This is a cat");
        cars.add("That is an elephant");
        System.out.println(cars);
        int count = 0;
        for (String a : cars) {
            char[] charArray = a.toCharArray();
            char char1 = 0;
            for (int i = 0; i < charArray.length; i++) {
                char1 = charArray[i];
                if (char1 == 'i') {
                    if (charArray[i + 1] == 's') {
                        count++;
                    }
                }
            }
        }
        System.out.println("total is are :: " + count);

    }
}




