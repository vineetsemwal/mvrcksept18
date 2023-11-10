package com.maveric.designpatterns.adapter;

public class Application implements IExistingContract{
    @Override
    public Person getPerson() {
        Person person=new Person(1,"sampath","1000");
        return person;
    }
}
