package collectiondemos.generic;

import java.util.Comparator;

public class NumberComparator implements Comparator<Number> {
    @Override
    public int compare(Number e1, Number e2) {
        return e1.intValue()-e2.intValue();
    }
}
