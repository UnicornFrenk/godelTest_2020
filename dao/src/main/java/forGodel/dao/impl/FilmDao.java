package forGodel.dao.impl;


import forGodel.dao.model.FilmsDTO;

import java.time.LocalDate;
import java.util.List;

public interface FilmDao {

    List<FilmsDTO>  getFilmsByDirector_Id(Long id);
    List<FilmsDTO> getFilmsByReleaseDateIsGreaterThanEqual(LocalDate releaseDate);
    List<FilmsDTO> getFilmsByDirector_IdAndReleaseDateIsGreaterThanEqual(Long id,
                                                LocalDate releaseDate);

}
