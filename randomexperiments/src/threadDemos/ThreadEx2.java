package threadDemos;

public class ThreadEx2 {
    public static void main(String[] args) throws Exception{
        Runnable runnable1=new RenderNumbers("thread1");
        Thread thread1=new Thread(runnable1);
        Thread thread2=new Thread(new RenderNumbers("thread2"));
        thread1.start();
        thread2.start();
        for (int i=0;i<5;i++){
            System.out.println("main-i="+i);
            Thread.sleep(1000);
        }
        thread1.join();
        thread2.join();
        System.out.println("bye main finished");

    }

    private static class RenderNumbers implements Runnable{
        private String name;
        public RenderNumbers(String name){
            this.name=name;
        }
        @Override
        public void run() {
            try{
            for (int i=0;i<5;i++) {
                System.out.println("thread="+name+",i=0");
                Thread.sleep(5000);
            }
            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }
}
