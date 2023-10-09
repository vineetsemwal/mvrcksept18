package collectiondemos.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListEx2 {
    public static void main(String[] args) {
        List<Integer>list=new ArrayList<>();
        list.add(2);
        list.add(1);
        list.add(3);
        Collections.sort(list);
        System.out.println(list);
    }
}
