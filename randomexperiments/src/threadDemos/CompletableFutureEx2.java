package threadDemos;

import java.util.concurrent.CompletableFuture;
import java.util.function.Function;
import java.util.function.Supplier;

public class CompletableFutureEx2 {
    public static void main(String[] args)throws Exception {

        CompletableFuture<String>future=CompletableFuture.supplyAsync(new OriginalTask());
        CompletableFuture<Integer>lengthTask=future.thenApplyAsync(new LengthTask());

        int result=lengthTask.get();
        System.out.println("result="+result);
    }

    private static class LengthTask implements Function<String,Integer> {
        @Override
        public Integer apply(String input) {
            return input.length();
        }
    }
    private static class OriginalTask implements Supplier<String>{
        @Override
        public String get() {
            return "bangalore";
        }
    }
}
