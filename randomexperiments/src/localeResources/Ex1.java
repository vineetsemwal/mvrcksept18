package localeResources;

public class Ex1 {
    public static void main(String[] args) {
        Ex1 demo=new Ex1();
        demo.method();
        Employee e1=new Employee(3,"mahesh");
        e1=null;


    }
    void method(){
        Employee emp1=new Employee(1,"sampath");
        System.out.println("empl-"+emp1.getName());
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
