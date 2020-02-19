package forGodel.dao;

import forGodel.dao.converter.FilmConverter;
import forGodel.dao.entity.Film;
import forGodel.dao.impl.FilmDao;
import forGodel.dao.model.FilmsDTO;
import forGodel.dao.repositoryJPA.FilmRepository;

import java.time.LocalDate;
import java.util.List;

public class FilmDaoImpl implements FilmDao {

    FilmRepository filmRepository;

    public FilmDaoImpl(FilmRepository filmRepository) {
        this.filmRepository = filmRepository;
    }

    @Override
    public List<FilmsDTO> getFilmsByDirector_Id(Long id) {
        List<Film> films = filmRepository.getFilmsByDirector_Id(id);
        return FilmConverter.allToDto(films);
    }
//    public List<FilmsDTO> findFilmsByDirectorId(long id) {
//        List<Film> films = (List<Film>) sessionFactory
//                .getCurrentSession()
//                .createQuery("from Film f where f.director_id=:id")
//                .setParameter("id", id).list();
//        return FilmConverter.allToDTO(films);
//    }

    @Override
    public List<FilmsDTO> getFilmsByReleaseDateIsGreaterThanEqual(LocalDate releaseDate) {
         List<Film> films =
                 filmRepository.getFilmsByReleaseDateIsGreaterThanEqual(releaseDate);
        return FilmConverter.allToDto(films);
    }

    @Override
    public List<FilmsDTO> getFilmsByDirector_IdAndReleaseDateIsGreaterThanEqual(Long id, LocalDate releaseDate) {
        List<Film> films =
              filmRepository.getFilmsByDirector_IdAndReleaseDateIsGreaterThanEqual(id,
                                                            releaseDate);
        return FilmConverter.allToDto(films);
    }
}
