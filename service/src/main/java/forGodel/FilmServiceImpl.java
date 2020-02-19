package forGodel;

import forGodel.dao.impl.FilmDao;
import forGodel.dao.model.FilmsDTO;

import java.time.LocalDate;
import java.util.List;

public class FilmServiceImpl implements FilmService {

    private FilmDao filmDao;

    public FilmServiceImpl(FilmDao filmDao) {
        this.filmDao = filmDao;
    }

    @Override
    public List<FilmsDTO> getFilmsByDirector_Id(Long id) {
        return filmDao.getFilmsByDirector_Id(id);
    }

    @Override
    public List<FilmsDTO> getFilmsByReleaseDateIsGreaterThanEqual(LocalDate releaseDate) {
        return filmDao.getFilmsByReleaseDateIsGreaterThanEqual(releaseDate);
    }

    @Override
    public List<FilmsDTO> getFilmsByDirector_IdAndReleaseDateIsGreaterThanEqual(Long id, LocalDate releaseDate) {
        return filmDao.getFilmsByDirector_IdAndReleaseDateIsGreaterThanEqual(id,releaseDate);
    }
}
