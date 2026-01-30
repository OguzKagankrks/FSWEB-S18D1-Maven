package com.workintech.sqldmljoins.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name = "kitap")
public class Kitap {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "kitapno")
    private Long kitapno;

    @Column(name = "ad")
    private String ad;

    @Column(name = "puan")
    private Integer puan;

    @Column(name = "yazarno")
    private Long yazarno;

    @Column(name = "turno")
    private Long turno;
}
