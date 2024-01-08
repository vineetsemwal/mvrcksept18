package com.maveric.customerms.domain;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

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
