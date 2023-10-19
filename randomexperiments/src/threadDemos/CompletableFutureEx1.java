package threadDemos;

import java.util.concurrent.CompletableFuture;
import java.util.function.Supplier;

public class CompletableFutureEx1 {

    public static void main(String[] args) throws Exception {
        CompletableFuture<String> future = CompletableFuture.supplyAsync(new ReadFileTask());
        CompletableFuture<String>resultFuture=future.completeAsync(new AlternateResult());
        String result= resultFuture.get();
        System.out.println("result="+result);
    }

    private static class AlternateResult implements Supplier<String> {
        @Override
        public String get() {
            return "hello-alternate";
        }
    }

    private static class ReadFileTask implements Supplier<String> {
        @Override
        public String get() {
            try {
                System.out.println("****reading file");
             //   Thread.sleep(10000);

                return "hi-original";
            } catch (Exception e) {
                e.printStackTrace();
                return null;
            }
        }
    }
}
