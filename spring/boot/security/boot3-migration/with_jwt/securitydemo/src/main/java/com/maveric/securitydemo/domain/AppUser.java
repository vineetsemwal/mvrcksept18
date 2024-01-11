package com.maveric.securitydemo.domain;

import lombok.*;

import jakarta.persistence.*;
import java.util.Set;

@Data
@EqualsAndHashCode(of = "username")
@RequiredArgsConstructor
@NoArgsConstructor
@Entity
public class AppUser {

    @Id
    // @Column(nullable = false,unique = true)
    @NonNull
    private String username;
    @Column(nullable = false)
    @NonNull
    private String password;

    @ElementCollection(fetch = FetchType.EAGER)
    @NonNull
    private Set<String> roles;


}
