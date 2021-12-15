package com.example.BankApp.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "Bank")
public class Bank {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "company")
    private String company;

    @Column(name = "curencyNr")
    private Integer curencyNr;

    @Column(name = "type")
    private String type;

    @Column(name = "headQuarters")
    private String headQuarters;

    @Column(name = "lastYearAttendance")
    private String lastYearAttendance;
}
