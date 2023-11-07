package com.maveric.jpademo1;

import javax.persistence.*;
import java.util.Objects;

@Table(name = "trainees_data")
@Entity
public class Trainee {
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Id
    private Integer id;
    @Column(unique = true,nullable = false)
    private String name;

    @ManyToOne(optional = true)
    private Department department;

    public Trainee(){}

    public Trainee(String name){
        this.name=name;
    }

    public Trainee( String name,Department department){
        this.name=name;
        this.department=department;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        Trainee trainee = (Trainee) object;
        return Objects.equals(id, trainee.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
