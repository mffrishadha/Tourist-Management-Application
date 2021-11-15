package com.example.demo.model;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Setter
@Getter
public class Booking {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column

    private Integer id;

    @Column
    private String date;

    @Column
    private String paymentReceipt_no;

}
