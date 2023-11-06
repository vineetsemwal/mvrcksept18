package com.maveric.jpademo1;

import javax.persistence.Entity;

@Entity
public class DevelopmentTrainee extends Trainee{
    private String language;
    public DevelopmentTrainee(String name, String department,Address address,String language){
    super(name, department, address);
    this.language=language;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }
}
