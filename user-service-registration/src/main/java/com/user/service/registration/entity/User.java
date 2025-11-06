package com.user.service.registration.entity;

import jakarta.annotation.Generated;
import jakarta.persistence.*;
import lombok.*;

@Entity
@NoArgsConstructor
@Data
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String name;
    private String email;
    private Long mobileNumber;
}
