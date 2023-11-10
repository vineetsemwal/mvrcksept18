package com.maveric.designpatterns.proxy;

public class ProxyImage extends RealImage {

    private byte[] data;
    private boolean loaded;

    public ProxyImage(String filePath) {
        super(filePath);
    }

    @Override
    public byte[] getData() {
        if (loaded) {
            return data;
        }
        data = super.getData();
        loaded = true;
        return data;
    }
}
