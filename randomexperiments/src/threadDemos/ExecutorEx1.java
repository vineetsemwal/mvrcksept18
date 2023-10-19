package threadDemos;

import iodemos.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class ExecutorEx1 {
    public static void main(String[] args) throws Exception {
        ExecutorService service = Executors.newFixedThreadPool(2);
        // ExecutorService service=Executors.newCachedThreadPool();
        // ExecutorService service = Executors.newSingleThreadExecutor();
        //service.execute(new RenderNumbers());
        //ScheduledExecutorService service =Executors.newScheduledThreadPool(2);
        //service.schedule(new RenderNumbers(),10,TimeUnit.SECONDS);
        Future<List<Employee>>future=service.submit(new FileReaderTask());
        System.out.println("task finished="+future.isDone());
        List<Employee>list=future.get();
        System.out.println("task finished="+future.isDone());
        System.out.println("fetched employees="+list);
        service.shutdown();
    }

    private static class FileReaderTask implements Callable<List<Employee>> {
        @Override
        public List<Employee> call() throws Exception {
            System.out.println("******reading file");
            Employee employee1 = new Employee(1, "karthik");
            Employee employee2 = new Employee(2, "hemanth");
            List<Employee> list = new ArrayList<>();
            list.add(employee1);
            list.add(employee2);
            return list;

        }
    }

    protected static class Employee {
        Employee(int id, String name) {
            this.id = id;
            this.name = name;
        }

        private int id;
        private String name;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return "Employee{" +
                    "id=" + id +
                    ", name='" + name + '\'' +
                    '}';
        }
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
