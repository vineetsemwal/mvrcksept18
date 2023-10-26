package fiLambda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.*;

public class MethodRefEx1 {

    int add(int num1, int num2){
        return num1+num2;
    }

    static int sub(int num1, int num2){
        return num1-num2;
    }

    public static void main(String[] args) {
        MethodRefEx1 demo=new MethodRefEx1();
        Consumer<String> consumer = System.out::println;
        BinaryOperator<Integer>addFun=demo::add;
        int result1=addFun.apply(1,2);
        BinaryOperator<Integer>subFun=MethodRefEx1::sub;

        Supplier<Student>studentNew1=Student::new;
        Student student1=studentNew1.get();
        System.out.println("student 1="+student1.id);
        Function<Integer,Student>studentNew2=Student::new;
        List<Integer>ids=new ArrayList<>();
        ids.add(1);
        ids.add(2);
        Consumer<Student>studentPrint=System.out::println;
       List<Student>students= demo.newStudents(studentNew2,ids);
       //declaring what operation has to be done
       students.forEach(studentPrint);

     Supplier<List<String>>listSupplier=  ArrayList::new;
      List<String>newList1 =listSupplier.get();
     Function<Integer,List<String>>listFun=ArrayList::new;
     List<String>newList2=listFun.apply(20);
    }

    List<Student> newStudents(Function<Integer,Student>function, List<Integer> ids){
       List<Student>students=new ArrayList<>();
        for (int id:ids){
           Student student=function.apply(id);
           students.add(student);
       }
        return students;
    }

    private static class Student{
        private int id;
        public Student(){
            id=-1;
        }
        public Student(int id){
            this.id=id;
        }

        @Override
        public String toString() {
            return "id-"+id;
        }
    }

}
