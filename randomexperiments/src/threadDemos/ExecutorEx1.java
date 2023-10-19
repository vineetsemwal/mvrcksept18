package threadDemos;

import java.util.concurrent.*;

public class ExecutorEx1 {
    public static void main(String[] args) throws Exception {
        ExecutorService service = Executors.newFixedThreadPool(2);
        // ExecutorService service=Executors.newCachedThreadPool();
        // ExecutorService service = Executors.newSingleThreadExecutor();
        //ScheduledExecutorService service =Executors.newScheduledThreadPool(2);
        //service.schedule(new RenderNumbers(),10,TimeUnit.SECONDS);
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
