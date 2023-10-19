package threadDemos;

public class ThreadEx1 {
    public static void main(String[] args) throws Exception{
        Thread thread1=new RenderNumbers("thread1");
        Thread thread2=new RenderNumbers("thread2");
        thread1.start();
        thread2.start();
        for (int i=0;i<5;i++){
            System.out.println("main-i="+i);
            Thread.sleep(5000);
        }

    }

    private static class RenderNumbers extends Thread{
        public RenderNumbers(String name){
            super(name);
        }
        @Override
        public void run() {
            try{
            for (int i=0;i<5;i++) {
                System.out.println("thread="+getName()+",i="+i);
                Thread.sleep(5000);
            }
            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }
}
