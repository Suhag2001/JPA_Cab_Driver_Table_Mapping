package com.bootcoding.JPACabDriverTableMaping.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "CabDriverRating")
public class Rating {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id ;
    private int trips ;
    private int cancelled ;
    private int accepted ;

    @OneToOne()
    private CabDriver cabDriver;

}
