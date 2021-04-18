package com.annual.jeeshared.entity;

import java.util.Date;

import javax.persistence.*;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "verification_token")
@Getter
@Setter
public class VerificationToken extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", unique = true, nullable = false)
    private Long id;

    @OneToOne
    private User user;

    private Date expirationDate;

    private String token;

    public boolean isTokenValid() {
        Date now = new Date();
        return expirationDate.after(now);
    }

}
