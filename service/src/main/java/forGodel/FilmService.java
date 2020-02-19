package forGodel;

import forGodel.dao.impl.FilmDao;
import forGodel.dao.model.FilmsDTO;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public interface FilmService{

    List<FilmsDTO> getFilmsByDirector_Id(Long id);
    List<FilmsDTO> getFilmsByReleaseDateIsGreaterThanEqual(LocalDate releaseDate);
    List<FilmsDTO> getFilmsByDirector_IdAndReleaseDateIsGreaterThanEqual(Long id,
                                                                         LocalDate releaseDate);

}
