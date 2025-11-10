package com.user.service.registration.entity;

import jakarta.annotation.Generated;
import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.*;
import org.hibernate.validator.constraints.Range;

@Entity
@NoArgsConstructor
@Data
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    @NotNull
    @Min(value = 4)
    private String name;

    @Email(regexp = "[a-z0-9._%+-]+@[a-z0-9.-]+\\.[a-z]{2,3}", flags = Pattern.Flag.CASE_INSENSITIVE)
    private String email;

    @Range(min = 10, max = 10, message = "Mobile number must be exactly 10 digits.")
    private Long mobileNumber;
}
