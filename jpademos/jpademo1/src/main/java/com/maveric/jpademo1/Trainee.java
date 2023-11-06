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
    @Column(name = "dept")
    private String department;
    public Trainee(){}

    public Trainee( String name, String department){
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
