package dev.viegas.backend.repositories;

import dev.viegas.backend.entities.Game;
import dev.viegas.backend.entities.GameList;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameListRepository extends JpaRepository<GameList, Long> {

}
