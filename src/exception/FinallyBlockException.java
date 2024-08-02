package exception;
public class FinallyBlockException {
    public static void main(String[] args) {

        try {
            System.out.println("from try block");
            throw new RuntimeException("from try exception");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("in finally block");
            try {
                throw new RuntimeException("from finally exception");
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
