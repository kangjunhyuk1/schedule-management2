package com.example.schedulemanagement2.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "schedule")
public abstract class ScheduleEntity extends BaseEntity{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long scheduleId;

    @Column(nullable = false)
    private String scheduleName;

    @Column(nullable = false)
    private String task;

    @ManyToOne
    @JoinColumn(name = "Id")
    private UserEntity userEntity;
}

