package threadDemos;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnmmWriteListEx1 {
    public static void main(String[] args) {
        List<Integer> list=new CopyOnWriteArrayList<>();
        list.add(1);
        list.add(2);

    }
}
