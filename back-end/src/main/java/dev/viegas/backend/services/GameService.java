package dev.viegas.backend.services;

import dev.viegas.backend.dto.GameDTO;
import dev.viegas.backend.dto.GameMinDTO;
import dev.viegas.backend.entities.Game;
import dev.viegas.backend.projections.GameMinProjection;
import dev.viegas.backend.repositories.GameRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class GameService {

    private final GameRepository gameRepository;

    public GameService(GameRepository gameRepository) {
        this.gameRepository = gameRepository;
    }

    @Transactional(readOnly = true)
    public List<GameMinDTO> getAll() {
        List<Game> games = gameRepository.findAll();
        return games.stream().map(GameMinDTO::new).toList();
    }

    @Transactional(readOnly = true)
    public GameDTO getById(Long id) {
        return new GameDTO(gameRepository.findById(id).get());
    }

    @Transactional(readOnly = true)
    public List<GameMinDTO> getByList(Long id) {
        List<GameMinProjection> games = gameRepository.searchByList(id);
        return games.stream().map(GameMinDTO::new).toList();
    }
}
