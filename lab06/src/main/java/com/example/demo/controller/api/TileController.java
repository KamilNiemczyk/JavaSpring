package com.example.demo.controller.api;

import com.example.demo.model.Tile;
import com.example.demo.service.TileService;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/tiles")
public class TileController {

    private final TileService tileService;

    public TileController(TileService tileService) {
        this.tileService = tileService;
    }

    @GetMapping
    public List<Tile> getTiles() {
        return tileService.getAllTiles();
    }

    @GetMapping("/{id}")
    public Tile getTile(@PathVariable Long id) {
        return tileService.getTileById(id);
    }

    @PostMapping
    public ResponseEntity<Tile> createTile(@RequestBody Tile tile) {
        Tile createdTile = tileService.createTile(tile);
        HttpHeaders headers = new HttpHeaders();
        headers.add("Location", "/api/tiles/" + createdTile.getId());
        return ResponseEntity.status(HttpStatus.CREATED).headers(headers).body(createdTile);
    }

    @PutMapping("/{id}")
    public Tile updateTile(@PathVariable Long id, @RequestBody Tile tile) {
        return tileService.updateTile(id, tile);
    }

    @DeleteMapping("/{id}")
    public void deleteTile(@PathVariable Long id) {
        tileService.deleteTile(id);
    }
}
