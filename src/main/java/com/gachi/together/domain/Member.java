package com.gachi.together.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@Table(name = "members")
@Getter
@Setter
public class Member extends BaseTimeEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String memberId;
    private String password;
    private String name;
    private String phoneNumber1;
    private String phoneNumber2;
    private String phoneNumber3;
    private String email1;
    private String email2;
    private String postalCode;
    private String address1;
    private String address2;
    private LocalDateTime joinDate;

    // Constructors, getters, and setters
    // ...

}
