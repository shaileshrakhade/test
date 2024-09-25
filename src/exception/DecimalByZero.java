package exception;

public class DecimalByZero {
    //Throw the exception at run time
    public static void main(String[] args) {
        try {
            System.out.println(10 / 0);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
