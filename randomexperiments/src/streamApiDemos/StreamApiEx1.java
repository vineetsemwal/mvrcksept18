package streamApiDemos;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamApiEx1 {

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
        List<Integer> result =  list.stream()
                .filter(str -> str.startsWith("a"))
                .map(str->str.length())
                .collect(Collectors.toList());
        return result;
    }

    long countAfterFilter(List<String> list) {
      //  Stream<String> stream1 = list.stream();
      //  Predicate<String> predicate = str -> str.startsWith("a");
      //  Stream<String> stream2 = stream1.filter(predicate);
       // long count = stream2.count();
      long count=  list.stream()
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

}
