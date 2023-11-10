package com.maveric.designpatterns.adapter;

public class NewClient {

    private INewContract contract;

    public NewClient(INewContract contract){
        this.contract=contract;
    }

    void renderPersonDetails() {
        PersonDetails person = contract.getPersonDetails();
        System.out.println("person details=" + person.getPersonId() + "-" + person.getPersonName());

    }

}
