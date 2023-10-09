package collectiondemos.generic;

public class Store<T> {
    private T value;
    void add(T value){
        this.value=value;
    }

    T getValue(){
        return value;
    }

}
