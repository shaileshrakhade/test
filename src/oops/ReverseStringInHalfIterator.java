package oops;

public class ReverseStringInHalfIterator {
    //revers the string in half iterators
    public static void main(String[] args) {
        String s = "exam";
        char[] chars = s.toCharArray();
        char[] newChars = new char[s.length()];
        for (int i = 0; i < chars.length; i++) {
            newChars[chars.length - i - 1] = chars[i];
            newChars[i] = chars[chars.length - i - 1];
        }
        System.out.println(String.valueOf(newChars));
    }
}
