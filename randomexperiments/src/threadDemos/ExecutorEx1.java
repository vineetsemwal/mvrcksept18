package threadDemos;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

public class ExecutorEx1 {
    public static void main(String[] args) {
        //ExecutorService service = Executors.newFixedThreadPool(1);
        ExecutorService service=Executors.newCachedThreadPool();
        service.execute(new RenderNumbers());
        service.execute(new RenderNumbers());
        service.shutdown();
    }

    private static class RenderNumbers implements Runnable {
        @Override
        public void run() {
            try {
                for (int i = 0; i < 5; i++) {
                    Thread thread = Thread.currentThread();
                    System.out.println("thread=" + thread.getName() + ",i=" + i);
                    Thread.sleep(1000);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
