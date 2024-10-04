package oops;

public class MultiplicationWithoutOperator {
    public static void main(String[] args) {
        A a = (v1, v2) -> {
            int total=0;
            for (int i=0;i<v2;i++) {
                total = total + v1;
            }
            return total;
        };
        System.out.println(a.mul(5, 15));
    }
}

interface A {
    int mul(int val1, int val2);

}
