package optionalDemos;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Optional;

public class OptionalEx1 {
    public static void main(String[] args) {
        Optional<String> optional1 = Optional.empty();
        if (optional1.isPresent()) {
            String value1 = optional1.get();
            System.out.println(value1);
        }
        OptionalEx1 ex1 = new OptionalEx1();
        List<String> list = new ArrayList<>();
        list.add("mumbai");
        list.add("delhi");
        Optional<String> optional2 = ex1.findStringStartingWithBan(list);
        if (optional2.isPresent()) {
            String value = optional2.get();
            System.out.println("value=" + value);
        } else {
            System.out.println("no string starting with Ban");
        }
    }

    Optional<String> findStringStartingWithBan(Collection<String> texts) {
        for (String iterated : texts) {
            if (iterated.startsWith("Ban")) {
                return Optional.of(iterated);
            }
        }
        return Optional.empty();
    }
}
