package oops;

public class DuplicateCharInString {
    //find duplicate char in String using only one for loop
    public static void main(String[] args) {
        String s = "abcxyzab";
        for (int i = 0; i < s.length(); i++) {
                isDuplicate(s, i, s.charAt(i));
        }
    }

    static void isDuplicate(String s, int i, char c) {
        i++;
        if (i < s.length()) {
//            System.out.println(c + "::" + s.charAt(i));
            if (c != s.charAt(i))
                isDuplicate(s, i, c);
            if (c == s.charAt(i)) {
                System.out.println(c);
            }


        }
    }
}
