package com.annual.jeeshared.entity;

import com.annual.jeeshared.enums.Role;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

@Entity
@Table(name = "users")
@Getter
@Setter
public class User extends BaseEntity {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "Name is required.")
    private String name;

    @NotBlank(message = "Password is required.")
    private String password;

    @NotBlank(message = "Email is required.")
    @Column(unique=true)
    private String email;

    private boolean enabled;

    @OneToOne
    private User admin;

    @OneToOne
    private User teamLeader;

    @Enumerated(EnumType.STRING)
    Role role;

}
