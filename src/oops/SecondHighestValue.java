package oops;

public class SecondHighestValue {
    public static void main(String[] args) {
        int[] abc = {6, 7, 1, 2, 3, 4, 5};
        int high = abc[0];
        int secHigh = 0;
        for (int j : abc) {
            if (high < j) {
                secHigh = high;
                high = j;
            }
        }
        System.out.println(secHigh);
    }
}
