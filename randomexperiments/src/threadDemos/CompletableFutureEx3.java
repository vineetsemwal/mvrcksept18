package threadDemos;

import java.util.concurrent.CompletableFuture;
import java.util.function.BiFunction;
import java.util.function.Supplier;

public class CompletableFutureEx3 {

    public static void main(String[] args)throws Exception {
        CompletableFuture<String>future=CompletableFuture.supplyAsync(new OriginalTask());
        CompletableFuture<String>resultFuture=future.handleAsync(new HandlerTask());
        String result=resultFuture.get();
        System.out.println(result);
    }
    private static class HandlerTask implements BiFunction<String,Throwable,String>{
        @Override
        public String apply(String result, Throwable exception) {
            if (exception!=null){
                return exception.getMessage()+"-something went wrong";
            }
            return result;
        }
    }
    private static class OriginalTask implements Supplier<String>{
        @Override
        public String get() {
          // return "Mumbai";
            throw new RuntimeException("originaltask threw exception");
        }
    }
}
