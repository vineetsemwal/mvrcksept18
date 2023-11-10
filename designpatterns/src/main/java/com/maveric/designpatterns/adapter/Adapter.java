package com.maveric.designpatterns.adapter;

public class Adapter implements INewContract{
    private IExistingContract oldContract;

    public Adapter(IExistingContract oldContract){
        this.oldContract=oldContract;
    }

    @Override
    public PersonDetails getPersonDetails() {
      Person person=  oldContract.getPerson();
      PersonDetails desired=new PersonDetails(person.getId(),person.getName());
      return desired;
    }
}
