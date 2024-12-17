package com.example.demo.exception;

public class TileNotFoundException extends RuntimeException {
    public TileNotFoundException(Long id) {
        super("Tile with id " + id + " not found");
    }
}
