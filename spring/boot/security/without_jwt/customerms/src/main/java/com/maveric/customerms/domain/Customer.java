package com.maveric.customerms.domain;



import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Objects;

@EqualsAndHashCode(of="id")
@NoArgsConstructor
@Data
@Table(name = "customers")
@Entity
public class Customer {

    @GeneratedValue
    @Id
    private Long id;
    @Column(name = "cname")
    private String name;

    private int age;

    @OneToOne(cascade = CascadeType.ALL)
    private AppUser user;

    @OneToOne(cascade = CascadeType.ALL)
    private Account account;


}
