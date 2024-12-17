package com.example.demo.model;


import jakarta.persistence.*;

@Entity
public class Creator {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @OneToOne(mappedBy = "creator")
    private Tile tile;

    public Creator(String name) {
        this.name = name;
    }
    public Creator() {
    }

}
