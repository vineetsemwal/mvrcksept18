package com.maveric.designpatterns.protype;

public class PrototypeUse {
    public static void main(String[] args) throws CloneNotSupportedException{
        Product product1=new Product("galaxy-g1",10000,"phone","samsung");
       Product product2=product1.clone();
       product2.setName("galaxy-g2");
       product2.setPrice(15000);

       if(product1!=product2){
           System.out.println("are different objects");
       }
        System.out.println("product1-"+product1.getName()+"-"+product1.getPrice()+"-"+product1.getCategory());
        System.out.println("product2-"+product2.getName()+"-"+product2.getPrice()+"-"+product2.getCategory());

    }
}
