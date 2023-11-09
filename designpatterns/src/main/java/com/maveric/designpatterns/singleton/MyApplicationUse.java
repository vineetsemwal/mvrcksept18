package com.maveric.designpatterns.singleton;

public class MyApplicationUse {
    public static void main(String[] args) {
        MyApplication  app1=MyApplication.getInstance();
        MyApplication app2=MyApplication.getInstance();
        if (app1==app2){
            System.out.println("***same instance");
        }

        System.out.println("app info="+app1.getPort()+"-"+app1.getServerIp()+"-"+app1.getApplicationName());
    }
}
