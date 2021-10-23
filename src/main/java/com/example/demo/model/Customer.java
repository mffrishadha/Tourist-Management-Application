package com.example.demo.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Setter
@Getter

public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Integer id;

    @Column
    private String firstname;

    @Column
    private String lastname;

    @Column
    private String phoneNo;

    @Column
    private String email;

    @Column
    private String nic;

    @Column
    private String passportNo;



}
