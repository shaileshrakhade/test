package exception;

public class DecimalByZero {
    //Throw the exception at run time
    //both static & non-static function work same!
    public static void main(String[] args) {
        try {
            System.out.println("from staticTestMethod :" + staticTestMethod());
            DecimalByZero obj = new DecimalByZero();
            System.out.println("from testMethod :" + obj.testMethod());
            System.out.println("direct expression: " + 10 / 0);
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static int staticTestMethod() {
        try {
            System.out.println("In try block");
            int result = 10 / 0;//exception throw here
            return 1;
        } catch (Exception e) {
            //this block is execute
            System.out.println("In catch block");
            return 2;
        } finally {
            System.out.println("In finally block");
            //value return 3 because it last execution
            // basically we are not returning anything from finally
            return 3;
        }
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
            //value return 3 because it last execution
            return 3;
        }
    }
}
