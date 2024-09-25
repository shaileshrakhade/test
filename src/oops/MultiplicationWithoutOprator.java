package oops;

public class MultiplicationWithoutOprator {
    public static void main(String[] args) {
        A a = (v1, v2) -> {
            for (int i=1;i<v2;i++) {
                v1 = v1 + v1;
            }
            return v1;
        };
        System.out.println(a.mul(5, 2));
    }
}

interface A {
    int mul(int val1, int val2);

}
