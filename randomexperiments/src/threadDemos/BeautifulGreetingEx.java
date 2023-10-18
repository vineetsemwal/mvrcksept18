package threadDemos;

public class BeautifulGreetingEx {

    public static void main(String[] args) {
        BeautifulGreeting greeter=new BeautifulGreeting("hello");
        Thread thread1=new Thread(new BeautifulRunningTask(greeter));
        Thread thread2=new Thread(new BeautifulRunningTask(greeter));
        thread1.start();
        thread2.start();
    }

    private static class BeautifulRunningTask implements Runnable {
        private BeautifulGreeting greeting;

        public BeautifulRunningTask(BeautifulGreeting greeting) {
            this.greeting = greeting;
        }

        @Override
        public void run() {
            greeting.greet();
        }
    }

    private static class BeautifulGreeting {
        private String msg;

        public BeautifulGreeting(String msg) {
            this.msg = msg;
        }

     synchronized   public void greet() {
            try {
                System.out.print("(");
                System.out.print(msg);
                Thread.sleep(1000);
                System.out.print(")");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
