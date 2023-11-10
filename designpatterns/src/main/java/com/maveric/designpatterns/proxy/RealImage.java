package com.maveric.designpatterns.proxy;

public class RealImage implements Image{
    private String filePath;

    public RealImage(String filePath){
        this.filePath=filePath;
    }

    @Override
    public byte[] getData() {
        System.out.println("loading file from file system="+filePath);
        byte data[]=new byte[0];
        System.out.println("filled byte array");
        return data;
    }
}
