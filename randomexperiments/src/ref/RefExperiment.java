package ref;

public class RefExperiment {

    public static void main(String[] args) {

        RefExperiment experiment = new RefExperiment();
        Student student = new Student(2, "poornima");
        experiment.change1(student);
        System.out.println("inside main");
        System.out.println(student.getName());
        int i = 10;
        experiment.change2(i);
        System.out.println("inside main");
        System.out.println("i="+i);
    }

    void change2(int i) {
        i = 11;
        System.out.println("inside change2 ,i="+i);
    }

    void change1(Student studentRefCopy) {
        System.out.println("inside change1");
        studentRefCopy.setName("santosh");
        System.out.println(studentRefCopy.getName());
    }


}
