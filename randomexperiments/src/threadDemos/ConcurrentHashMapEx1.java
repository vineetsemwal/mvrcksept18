package threadDemos;

import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapEx1 {
    public static void main(String[] args) {
        ConcurrentHashMap<Integer,Employee>map=new ConcurrentHashMap<>();
        map.put(1, new Employee(1,"sampath"));
        map.put(2,new Employee(2,"hemanth"));
        map.putIfAbsent(3,new Employee(3,"mahesh"));

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

}
