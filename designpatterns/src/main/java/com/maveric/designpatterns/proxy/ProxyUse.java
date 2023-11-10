package com.maveric.designpatterns.proxy;

public class ProxyUse {
    public static void main(String[] args) {
        Image image=new ProxyImage("c:/abc.img");
        byte data1[]= image.getData();
        System.out.println("rendering data");
        byte data2[]=image.getData();
        System.out.println("rending data");
    }
}
