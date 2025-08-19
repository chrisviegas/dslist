package dev.viegas.backend.controllers;

import dev.viegas.backend.dto.GameDTO;
import dev.viegas.backend.dto.GameListDTO;
import dev.viegas.backend.dto.GameMinDTO;
import dev.viegas.backend.services.GameListService;
import dev.viegas.backend.services.GameService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/lists")
public class GameListController {

    private final GameListService gameListService;

    public GameListController(GameListService gameListService) {
        this.gameListService = gameListService;
    }

    @GetMapping
    public ResponseEntity<List<GameListDTO>> getAll() {
        return ResponseEntity.ok(gameListService.getAll());
    }
}
