package com.annual.jeeshared.entity;

import com.annual.jeeshared.enums.ApplicationStatus;
import com.annual.jeeshared.enums.ApplicationType;
import com.fasterxml.jackson.databind.ser.Serializers;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "applications")
@Getter
@Setter
public class Application extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    @Column(name = "start_date")
    Timestamp from;

    @Column(name = "end_date")
    Timestamp to;

    @ManyToOne
    private User requestedBy;

    @Enumerated
    ApplicationType applicationType;

    @Enumerated
    private ApplicationStatus status;

}
