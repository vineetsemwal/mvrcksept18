package com.maveric.jpademo1;

import javax.persistence.*;
import java.util.Objects;
import java.util.Set;

@Table(name = "departments")
@Entity
public class Department {
    @Id
    private String id;

    private String name;

    private String location;

    @ManyToMany(mappedBy = "departments")
    private Set<Trainee>trainees;

    public Set<Trainee> getTrainees(){
        return trainees;
    }
    public void setTrainees(Set<Trainee>trainees){
        this.trainees=trainees;
    }

    public Department(){}

    public Department(String id,String name,String location){
        this.id=id;
        this.name=name;
        this.location=location;
    }
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        Department that = (Department) object;
        return Objects.equals(id, that.id);
    }
}
