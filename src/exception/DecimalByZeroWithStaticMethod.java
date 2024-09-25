package exception;

public class DecimalByZeroWithStaticMethod {
    public static void main(String[] args) {
        int i = testMethod();
        System.out.println(i);
    }

    public static int testMethod() {
        try {
            System.out.println("In try block");
            int result = 10 / 0;
            return 1;
        } catch (Exception e) {
            System.out.println("In catch block");
            return 2;
        } finally {
            System.out.println("In finally block");
            //value return 3 because it last execution
            return 3;
        }
    }
}
