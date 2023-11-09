package com.maveric.designpatterns.protype;

public class Product implements Cloneable{
    private String name;
    private double price;
    private String category;
    private String manufacturedBy;
    public Product(String name, double price, String category, String manufacturedBy){
        this.category=category;
        this.name=name;
        this.price=price;
        this.manufacturedBy=manufacturedBy;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getManufacturedBy() {
        return manufacturedBy;
    }

    public void setManufacturedBy(String manufacturedBy) {
        this.manufacturedBy = manufacturedBy;
    }

    @Override
    public Product clone() throws CloneNotSupportedException {
        Object obj= super.clone();
        Product product=(Product) obj;
        return product;
      //  Product newProduct=new Product(name,price,category,manufacturedBy);
      //  return newProduct;
    }
}
