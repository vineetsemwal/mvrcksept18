package com.example.demo;

import jakarta.validation.constraints.NotNull;
import lombok.*;

import java.util.Objects;

@RequiredArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(of = "id")
@Data
public class Customer {

    @NonNull
    @Setter(value = AccessLevel.PRIVATE)
    private Long id;
    @MyValidatorAnnotation
    private String name;
    @NonNull
    private int age;
    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
