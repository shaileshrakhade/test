package exception;

public class DecimalByZeroWithMethod {
    public static void main(String[] args) {
        DecimalByZeroWithMethod obj = new DecimalByZeroWithMethod();
        int i = obj.testMethod();
        System.out.println(i);
    }

    public int testMethod() {
        try {
            System.out.println("In try block");
            int result = 10 / 0;
            return 1;
        } catch (Exception e) {
            System.out.println("In catch block");
            return 2;
        } finally {
            System.out.println("In finally block");
            return 3;
        }
    }
}
