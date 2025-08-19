package dev.viegas.backend.services;

import dev.viegas.backend.dto.GameDTO;
import dev.viegas.backend.dto.GameListDTO;
import dev.viegas.backend.dto.GameMinDTO;
import dev.viegas.backend.entities.Game;
import dev.viegas.backend.entities.GameList;
import dev.viegas.backend.repositories.GameListRepository;
import dev.viegas.backend.repositories.GameRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class GameListService {

    private final GameListRepository gameListRepository;

    public GameListService(GameListRepository gameListRepository) {
        this.gameListRepository = gameListRepository;
    }

    @Transactional(readOnly = true)
    public List<GameListDTO> getAll() {
        List<GameList> lists = gameListRepository.findAll();
        return lists.stream().map(GameListDTO::new).toList();
    }
}
