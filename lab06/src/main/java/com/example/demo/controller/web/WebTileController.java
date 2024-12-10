package com.example.demo.controller.web;


import com.example.demo.service.TileService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WebTileController {

    private final TileService tileService;

    public WebTileController(TileService tileService) {
        this.tileService = tileService;
    }

    @GetMapping("/tiles")
    public String getTiles(Model model) {
        model.addAttribute("tiles", tileService.getAllTiles());
        return "tiles/list";
    }

}
