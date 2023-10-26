package fiLambda;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.*;

public class MethodRefEx1 {

    int square(int num){
        return num*num;
    }
    int add(int num1, int num2) {
        return num1 + num2;
    }

    static int sub(int num1, int num2) {
        return num1 - num2;
    }

    public static void main(String[] args) {
        MethodRefEx1 demo = new MethodRefEx1();
        Consumer<String> consumer = System.out::println;
        BinaryOperator<Integer> addFun = demo::add;
        int result1 = addFun.apply(1, 2);
        BinaryOperator<Integer> subFun = MethodRefEx1::sub;

        Supplier<Student> studentNew1 = Student::new;
        Student student1 = studentNew1.get();
        System.out.println("student 1=" + student1.id);
        Function<Integer, Student> studentNew2 = Student::new;
        List<Integer> ids = new ArrayList<>();
        ids.add(1);
        ids.add(2);
        Consumer<Student> studentPrint = System.out::println;
        List<Student> students = demo.newStudents(studentNew2, ids);
        //declaring what operation has to be done
        students.forEach(studentPrint);

        Supplier<List<String>> listSupplier = ArrayList::new;
        List<String> newList1 = listSupplier.get();
        Function<Integer, List<String>> listFun = ArrayList::new;
        List<String> newList2 = listFun.apply(20);

        // method reference on arbitrary object of definite type
        Comparator<Student>comparator1=Student::compareTo;
        Comparator<Student>comparator2=(studArg1,studArg2)->studArg1.compareTo(studArg2);
        UnaryOperator<String>lowerCaseFun1 =String::toLowerCase;
        UnaryOperator<String>lowerCaseFun2=(str)->str.toLowerCase();
        //(str)->str.length()
        Function<String,Integer>lengthFun =String::length;
        //(str,start)->str.substring(start)
        BiFunction<String,Integer,String>substringFun=String::substring;
       //(ref,num)->ref.square(num)
        BiFunction<MethodRefEx1,Integer,Integer>squareFun =MethodRefEx1::square;


    }

    List<Student> newStudents(Function<Integer, Student> function, List<Integer> ids) {
        List<Student> students = new ArrayList<>();
        for (int id : ids) {
            Student student = function.apply(id);
            students.add(student);
        }
        return students;
    }

    private static class Student implements Comparable<Student> {
        private int id;

        public Student() {
            id = -1;
        }

        public Student(int id) {
            this.id = id;
        }

        @Override
        public String toString() {
            return "id-" + id;
        }

        @Override
        public int compareTo(Student other) {
            return id - other.id;
        }
    }

}
