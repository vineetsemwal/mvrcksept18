package com.maveric.designpatterns.adapter;

public class AdapterUse {
    public static void main(String[] args) {
        IExistingContract oldContract = new Application();
        System.out.println("****old client working");
        OldClient oldClient = new OldClient(oldContract);
        oldClient.renders();

        System.out.println("*****new client working");
        INewContract newContract = new Adapter(oldContract);
        NewClient newClient = new NewClient(newContract);
       newClient.renderPersonDetails();

    }
}
