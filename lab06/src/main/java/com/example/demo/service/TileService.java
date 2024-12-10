package com.example.demo.service;

import com.example.demo.exception.TileNotFoundException;
import com.example.demo.model.Tile;
import org.springframework.stereotype.Service;
import java.util.*;

@Service
public class TileService {

    private final Map<Long, Tile> tiles = new HashMap<>();

    public TileService() {
        tiles.put(Long.valueOf("131231"), new Tile("131231", "Tile1", 10, 10, 10, "Material1", "Location1"));
        tiles.put(Long.valueOf("2123"), new Tile("2123", "Tile2", 20, 20, 20, "Material2", "Location2"));
        tiles.put(Long.valueOf("3312"), new Tile("3312", "Tile3", 30, 30, 30, "Material3", "Location3"));
    }

    public List<Tile> getAllTiles() {
        return new ArrayList<>(tiles.values());
    }

    public Tile getTileById(Long id) {
        Tile tile = tiles.get(id);
        if (tile == null) {
            throw new TileNotFoundException(id);
        }
        return tile;
    }

    public Tile createTile(Tile tile) {
        if (tiles.containsKey(tile.getId())) {
            throw new IllegalArgumentException("Tile with ID " + tile.getId() + " already exists.");
        }
        tiles.put(tile.getId(), tile);
        return tile;
    }

    public Tile updateTile(Long id, Tile tile) {
        Tile existingTile = tiles.get(id);
        if (existingTile == null) {
            throw new TileNotFoundException(id);
        }
        existingTile.setName(tile.getName());
        existingTile.setHeight(tile.getHeight());
        existingTile.setWidth(tile.getWidth());
        existingTile.setPrice(tile.getPrice());
        existingTile.setMaterial(tile.getMaterial());
        existingTile.setProductionLocation(tile.getProductionLocation());
        return existingTile;
    }

    public void deleteTile(Long id) {
        if (!tiles.containsKey(id)) {
            throw new TileNotFoundException(id);
        }
        tiles.remove(id);
    }
}