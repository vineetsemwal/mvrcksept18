package com.maveric.customerms.domain;



import jakarta.persistence.*;

import java.util.Objects;
import java.util.Set;

@Table(name = "customers")

@Entity
public class Customer {
    @GeneratedValue
    @Id
    private Long id;
    @Column(name = "cname")
    private String name;

    private int age;

    @OneToOne
    private Account account;

    public Customer(){}
    public Customer(long id,String name){
        this.id=id;
        this.name=name;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Customer customer = (Customer) o;
        return Objects.equals(id, customer.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
