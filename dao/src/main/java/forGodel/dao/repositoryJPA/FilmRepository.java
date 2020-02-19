package forGodel.dao.repositoryJPA;

import forGodel.dao.entity.Film;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;
import java.util.List;

public interface FilmRepository extends JpaRepository<Film, Long> {

   List<Film> getFilmsByDirector_Id(Long id);


    List<Film> getFilmsByReleaseDateIsGreaterThanEqual(LocalDate releaseDate);

    List<Film> getFilmsByDirector_IdAndReleaseDateIsGreaterThanEqual(Long id,
                                                 LocalDate releaseDate);
}
