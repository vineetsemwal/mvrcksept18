package com.maveric.jpademo1;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "trainees_data")
@Entity
public class Trainee {
    @Id
    private Integer id;
    @Column(unique = true,nullable = false)
    private String name;
    @Column(name = "dept")
    private String department;
    public Trainee(){}

    public Trainee(int id, String name, String department){
        this.id=id;
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

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}
