package collectiondemos.generic;

import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Util {

    public <E> E findFirstElement(List<E> list){
        return list.get(0);
    }

    public <E extends Number>E findSmallest(List<E>list){
        list.sort(new NumberComparator());
        return list.get(0);
    }

}
