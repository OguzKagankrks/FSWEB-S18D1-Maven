package com.workintech.sqldmljoins.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name = "ogrenci")
public class Ogrenci {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ogrno")
    private Long ogrno;

    @Column(name = "ad")
    private String ad;

    @Column(name = "soyad")
    private String soyad;

    @Column(name = "cinsiyet")
    private String cinsiyet;

    @Column(name = "sinif")
    private String sinif;

    @Column(name = "puan")
    private Integer puan;


    @Column(name = "dtarih", nullable = true)
    private String dtarih;
}
