package com.example.demo.controller;


import com.example.demo.exception.TileNotFoundException;
import com.example.demo.model.Tile;
import org.springframework.boot.CommandLineRunner;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/tiles")
public class TileController implements CommandLineRunner {

    private Map<String, Tile> tiles = new HashMap<>();

    @Override
    public void run(String... args) throws Exception {
        tiles.put("131231", new Tile("131231", "Tile1", 10, 10, 10, "Material1", "Location1"));
        tiles.put("2123", new Tile("2123", "Tile2", 20, 20, 20, "Material2", "Location2"));
        tiles.put("3312", new Tile("3312", "Tile3", 30, 30, 30, "Material3", "Location3"));
    }

    @GetMapping
    public List<Tile> getTiles() {
        return new ArrayList<>(tiles.values());
    }

    @GetMapping("/{id}")
    public Tile getTile(@PathVariable String id) {
        Tile tile = tiles.get(id);
        if (tile == null) {
            throw new TileNotFoundException(id);
        }
        return tiles.get(id);
    }

    @PostMapping
    public ResponseEntity<Tile> createTile(@RequestBody Tile tile) {
        tiles.put(tile.getId(), tile);
        HttpHeaders headers = new HttpHeaders();
        headers.add("Location", "/api/tiles/" + tile.getId());
        return ResponseEntity.status(HttpStatus.CREATED).headers(headers).body(tile);
    }

    @PutMapping("/{id}")
    public Tile updateTile(@PathVariable String id, @RequestBody Tile tile) {
        Tile til = tiles.get(id);
        if (til == null) {
            throw new TileNotFoundException(id);
        }
        til.setName(tile.getName());
        til.setHeight(tile.getHeight());
        til.setWidth(tile.getWidth());
        til.setPrice(tile.getPrice());
        til.setMaterial(tile.getMaterial());
        til.setProductionLocation(tile.getProductionLocation());
        return til;
    }

    @DeleteMapping("/{id}")
    public void deleteTile(@PathVariable String id) {
        Tile tile = tiles.get(id);
        if (tile == null) {
            throw new TileNotFoundException(id);
        }
        tiles.remove(id);
    }

}
