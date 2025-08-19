package dev.viegas.backend.dto;

import dev.viegas.backend.entities.Game;
import dev.viegas.backend.projections.GameMinProjection;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class GameMinDTO {

    private Long id;
    private String title;
    private Integer year;
    private String imgUrl;
    private String shortDescription;

    public GameMinDTO(Game entity) {
        shortDescription = entity.getShortDescription();
        imgUrl = entity.getImgUrl();
        year = entity.getYear();
        title = entity.getTitle();
        id = entity.getId();
    }

    public GameMinDTO(GameMinProjection projection) {
        shortDescription = projection.getShortDescription();
        imgUrl = projection.getImgUrl();
        year = projection.getYear();
        title = projection.getTitle();
        id = projection.getId();
    }
}
