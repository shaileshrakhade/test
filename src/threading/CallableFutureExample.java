package threading;//import required classes and package if any
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;
import java.util.Random;

//create class CallableInterface that implements Callable interface   
class CallableInterface implements Callable<Object> {

    // override the call() method      
    @Override

    public Object call() throws Exception {

        //create an instance of the  Random class      
        Random obj = new Random();

        //generate a random number between 0-10   
        Integer number = obj.nextInt(10);

        //delay thread for some random time     
        Thread.sleep(number * 1000);

        //return the object having the generated random number     
        return number;
    }
}

// create CallableFutureExample class   
public class CallableFutureExample{

    //main() method start   
    @SuppressWarnings({ "unchecked", "rawtypes" })

    public static void main(String args[]) throws InterruptedException, ExecutionException {

        //create an array of FutureTask   
        //A concrete class having implementation of both Runnable and Future is called FutureTask   
        FutureTask[] returnedTask = new FutureTask[5];

        //use for loop   
        for(int i = 0; i < 5; i++) {
            //create an instance of Callable   
            Callable callableObj = new CallableInterface();

            //create an instance of FutureTask with Callable   
            returnedTask[i] = new FutureTask(callableObj);

            // create a Thread with FutureTask   
            Thread thread = new Thread(returnedTask[i]);

            thread.start();
        }

        //use for loop for printing returned value of each callable   
        for(int j = 0; j < 5; j++) {
            // use get() method of FutureTask to print the returned value   
            System.out.println("Callable["+j+"] ===> "+returnedTask[j].get());
        }
    }
}  