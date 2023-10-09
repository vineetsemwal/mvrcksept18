package collectiondemos.generic;

public class StoreTest {
    public static void main(String[] args) {
        Store<Integer> store=new Store<>();
        store.add(100);
        int value=store.getValue();


    }
}
