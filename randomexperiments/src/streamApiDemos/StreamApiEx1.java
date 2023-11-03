package streamApiDemos;

import java.util.*;
import java.util.function.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamApiEx1 {

    public static void main(String[] args) {
        List<Employee> testDepartment = new ArrayList<>();
        testDepartment.add(new Employee(1, "sampath"));
        testDepartment.add(new Employee(2, "archana"));
        List<Employee> devDepartment = new ArrayList<>();
        devDepartment.add(new Employee(3, "shweta"));
        devDepartment.add(new Employee(4, "lynita"));
        List<List<Employee>> departments = new ArrayList<>();
        departments.add(testDepartment);
        departments.add(devDepartment);
        StreamApiEx1 demo = new StreamApiEx1();
        long count = demo.allEmployeesCount(departments);
        List<String> list = new ArrayList<>();
        list.add("abc");
        list.add("de");
        demo.multiplyLengthOfAllText2(list);
    }

    //keep only strings starting from a
    // find the lengths of all filtered strings in list
    List<Integer> elementsLength1(List<String> list) {
        List<Integer> result = new ArrayList<>();
        for (String iterated : list) {
            if (iterated.startsWith("a")) {
                result.add(iterated.length());
            }
        }
        return result;
    }

    //keep only strings starting from a
    // find the lengths of all filtered strings in list
    List<Integer> elementsLength2(List<String> list) {
       /*
        Stream<String> stream1 = list.stream();
        Predicate<String> predicate = str -> str.startsWith("a");
        Stream<String> stream2 = stream1.filter(predicate);
        Function<String, Integer> function = str -> {
            System.out.println("str=" + str);
            return str.length();
        };
        Stream<Integer> stream3 = stream2.map(function);
        List<Integer> result = stream3.collect(Collectors.toList());
     */
        List<Integer> result = list.stream()
                .filter(str -> str.startsWith("a"))
                .map(str -> str.length())
                .collect(Collectors.toList());
        return result;
    }

    long countAfterFilter(List<String> list) {
        //  Stream<String> stream1 = list.stream();
        //  Predicate<String> predicate = str -> str.startsWith("a");
        //  Stream<String> stream2 = stream1.filter(predicate);
        // long count = stream2.count();
        long count = list.stream()
                .filter(str -> str.startsWith("a"))
                .count();
        return count;
    }

    void differentElements(Collection<String> collection) {
        // Stream<String> stream1 = collection.stream();
        // Stream<String> stream2 = stream1.distinct();
        //   Consumer<String>consumer=System.out::println;
        // stream2.forEach(consumer);
        collection.stream()
                .distinct()
                .forEach(System.out::println);
    }

    long allEmployeesCount(Collection<List<Employee>> departments) {
        Stream<List<Employee>> stream = departments.stream();
        Function<Collection<Employee>, Stream<Employee>> function = dept -> dept.stream();
        Stream<Employee> finalStream = stream.flatMap(function);
        long count = finalStream.count();
        return count;

    }


    void addLengthOfAllText(Collection<String> collection) {
        BinaryOperator<Integer> operator = (len1, len2) -> len1 + len2;
        Optional<Integer> optional = collection.stream()
                .map(text -> text.length())
                .reduce(operator);
        if (optional.isPresent()) {
            Integer total = optional.get();
            System.out.println("combined length=" + total);
        }

    }

    void multiplyLengthOfAllText(Collection<String> collection) {
        BinaryOperator<Integer> operator = (len1, len2) -> len1 * len2;
        Integer identity = 1;
        int result = collection.stream()
                .map(text -> text.length())
                .reduce(identity, operator);

        System.out.println("result=" + result);
    }

    void multiplyLengthOfAllText2(Collection<String> collection) {
        BinaryOperator<Integer> operator = (len1, len2) -> {
            System.out.println("inside operator");
            return len1 * len2;
        };
        BinaryOperator<Integer>combiner=(len1,len2)-> {
            System.out.println("inside combiner");
            return   len1+len2;
        };
        Integer identity = 1;
        int result = collection.stream()
                .map(text -> text.length())
                .reduce(identity, operator,combiner);

        System.out.println("result=" + result);
    }

    void collect1(Collection<String> collection) {
        List<String> list = collection.stream()
                .collect(Collectors.toList());

    }

    public void collect2(Collection<String> collection) {

        Set<String> set = collection.stream()
                .collect(Collectors.toSet());
    }

    /*
        Map<Integer,Employee>
     */
    public void collect3(Collection<Employee> collection) {
        Function<Employee, Integer> keyMapper = employee -> employee.id;
        Function<Employee, String> valueMapper = employee -> employee.name;
        Map<Integer, String> map = collection.stream().collect(Collectors.toMap(keyMapper, valueMapper));

    }

    public void collect4(Collection<Employee>collection){
        collection.stream()
                .collect()
    }

    private static class Employee {
        private int id;
        private String name;

        public Employee(int id, String name) {
            this.id = id;
            this.name = name;
        }
    }

}
