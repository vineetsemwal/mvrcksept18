package com.maveric.designpatterns.singleton;

public class MyApplication {

    private static MyApplication instance=new MyApplication();

    private MyApplication(){}

    public static MyApplication getInstance(){
        return instance;
    }
    /*
    public static MyApplication getInstance(int port, String ip, String appName){
        instance.port=port;
        instance.serverIp=ip;
        instance.applicationName=appName;
        return instance;
    }*/

    private int port=80;
    private String serverIp="172.168.32.1";

    private String applicationName="customerms";

    public int getPort() {
        return port;
    }

    public String getServerIp() {
        return serverIp;
    }

    public String getApplicationName() {
        return applicationName;
    }
}
