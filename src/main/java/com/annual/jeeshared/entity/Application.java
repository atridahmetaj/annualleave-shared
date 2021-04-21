package com.annual.jeeshared.entity;

import com.annual.jeeshared.enums.ApplicationStatus;
import com.annual.jeeshared.enums.ApplicationType;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "applications")
@Getter
@Setter
@ToString
public class Application extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    @Column(name = "start_date")
    Date from;

    @Column(name = "end_date")
    Date to;

    @ManyToOne
    private User requestedBy;

    @Enumerated(EnumType.STRING)
    ApplicationType applicationType;

    @Enumerated(EnumType.STRING)
    private ApplicationStatus status;

}
