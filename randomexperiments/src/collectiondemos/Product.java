package collectiondemos;

public class Product implements Comparable<Product>{
    private int id;
    private String name;

    public Product(int id, String name){
        this.id=id;
        this.name=name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int hashCode() {
        return  id;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj==this){
            return true;
        }
        if(obj==null || (!(obj instanceof Product))){
            return false;
        }
        Product that=(Product) obj;
        return that.id==id;
    }

    @Override
    public int compareTo(Product o) {
        return (id-o.id);
    }

    @Override
    public String toString() {
        return "product-"+ id+"-"+name;
    }
}
