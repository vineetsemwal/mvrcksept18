package com.maveric.designpatterns.adapter;

public class PersonDetails {
    private int personId;
    private String personName;
    public PersonDetails(int personId, String personName){
        this.personId=personId;
        this.personName=personName;
    }

    public int getPersonId() {
        return personId;
    }

    public void setPersonId(int personId) {
        this.personId = personId;
    }

    public String getPersonName() {
        return personName;
    }

    public void setPersonName(String personName) {
        this.personName = personName;
    }
}
