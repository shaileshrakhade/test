package threading;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CompletableFutureExample {
    public static void main(String[] args) throws ExecutionException, InterruptedException {

        CompletableFuture<String> completableFuture =CompletableFuture.supplyAsync(()-> "india");
        CompletableFuture<String> completableFuture1 =CompletableFuture.supplyAsync(()-> "is");
        CompletableFuture<String> completableFuture2 =CompletableFuture.supplyAsync(()-> "great");

       //run  all the object at same time in async mode it was not return any values
        CompletableFuture.allOf(completableFuture,completableFuture1,completableFuture2);

        // checking the object processing is done of not
        System.out.println(completableFuture.isDone());
        System.out.println(completableFuture1.isDone());
        System.out.println(completableFuture2.isDone());

        //get the result from object
        System.out.println(completableFuture.get());

        //join all object result using Stream API by used by Join method in CompletableFuture
        String result= Stream.of(completableFuture,completableFuture1,completableFuture2)
                .map(CompletableFuture::join)
                .collect(Collectors.joining(" "));
        System.out.println(result);
    }
}
