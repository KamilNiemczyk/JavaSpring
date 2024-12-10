package com.example.demo.model;


import jakarta.persistence.*;

import java.util.List;

@Entity
public class Producer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @OneToMany(mappedBy = "producer")
    private List<Tile> tiles;

    public Producer(String name) {
        this.name = name;
    }
    public Producer() {
    }


}
