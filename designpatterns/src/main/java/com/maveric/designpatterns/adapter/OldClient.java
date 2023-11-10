package com.maveric.designpatterns.adapter;

public class OldClient {
    private IExistingContract existing;
    public OldClient(IExistingContract existing){
        this.existing=existing;
    }
    void renders(){
      Person person=  existing.getPerson();
        System.out.println("person-"+person.getId()+"-"+person.getName()+"-"+person.getPhoneNumber());
    }

}
