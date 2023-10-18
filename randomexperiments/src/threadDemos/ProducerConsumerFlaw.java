package threadDemos;

public class ProducerConsumerFlaw {
    public static void main(String[] args) {
        ProduceConsumeResource resource=new ProduceConsumeResource();
        Thread thread1=new Thread(new ProducerTask(resource));
        Thread thread2=new Thread(new ConsumerTask(resource));
        thread1.start();
        thread2.start();
    }
    private static class ProduceConsumeResource {
        private int i;

        synchronized public void produce() {
            try {
                i++;
                System.out.println("produced " + i);
                Thread.sleep(100);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        synchronized public void consume() {
            try {
                System.out.println("consumed" + i);
                Thread.sleep(1000);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    private static class ProducerTask implements Runnable {
        private ProduceConsumeResource resource;

        public ProducerTask(ProduceConsumeResource resource) {
            this.resource = resource;
        }
        @Override
        public void run() {
            try {
                for (int i = 0; i < 5; i++) {
                    resource.produce();
                    Thread.sleep(100);
                }
            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }
    private static class ConsumerTask implements Runnable{

        private ProduceConsumeResource resource;

        public ConsumerTask(ProduceConsumeResource resource){
            this.resource = resource;
        }

        @Override
        public void run() {
            try {
                for (int i = 0; i < 5; i++) {
                    resource.consume();
                    Thread.sleep(1000);
                }
            }catch (Exception e ){
                e.printStackTrace();
            }
        }
    }
}
