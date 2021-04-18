package com.annual.jeeshared.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import java.sql.Timestamp;

@Getter
@Setter
@ToString
@MappedSuperclass
public class BaseEntity {

    @Column(name = "created_at", updatable = true)
    @CreationTimestamp
    private Timestamp createdAt;

    @Column(name = "updated_at", updatable = true)
    @UpdateTimestamp
    private Timestamp updatedAt;
}
