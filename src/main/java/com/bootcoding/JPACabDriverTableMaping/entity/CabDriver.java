package com.bootcoding.JPACabDriverTableMaping.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "CabDriver")
public class CabDriver {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private  String name ;
    private  String email ;
    private  String address ;
    private  long mobile ;

    @OneToOne(mappedBy = "cabDriver" , cascade = CascadeType.ALL)
    private Rating rating ;
}
