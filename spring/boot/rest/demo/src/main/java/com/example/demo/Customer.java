package com.example.demo;

import jakarta.validation.constraints.NotNull;
import lombok.*;
import lombok.extern.slf4j.Slf4j;

import java.util.Objects;

@RequiredArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(of = "id")
@Data
public class Customer {


    @NonNull
    //@Setter(value = AccessLevel.PRIVATE)
    private Long id;
    @MyValidatorAnnotation
   @NonNull private String name;
    @NonNull private int age;


}
