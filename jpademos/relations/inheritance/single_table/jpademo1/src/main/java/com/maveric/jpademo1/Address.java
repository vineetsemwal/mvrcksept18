package com.maveric.jpademo1;

import javax.persistence.*;

@Table(name ="trainees_address")
@Entity
public  class Address {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Integer id;
    private String city;

    private String building;

    public Address(){}

    public Address(String city,  String building){
        this.city=city;
        this.building=building;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }


    public String getBuilding() {
        return building;
    }

    public void setBuilding(String building) {
        this.building = building;
    }
}
