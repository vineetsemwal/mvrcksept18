package com.maveric.securitydemo.domain;

import lombok.Data;
import lombok.NoArgsConstructor;

import jakarta.persistence.*;

@NoArgsConstructor
@Data
@Entity
public class Admin {
    @GeneratedValue
    @Id
    private Long id;
    @OneToOne(cascade = CascadeType.ALL)
    private AppUser user;

}
