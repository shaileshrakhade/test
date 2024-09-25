package oops;

public class Arithmetic {
    public static void main(String[] args) {
        try {
            //compiler not complied because it /0 directly used.
            int a = 10 / 0;
        } catch (Exception e) {
            System.out.println(e);
        }  // already handle by Exception the bellow one not used

    }
}
