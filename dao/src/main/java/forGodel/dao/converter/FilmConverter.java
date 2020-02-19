package forGodel.dao.converter;


import forGodel.dao.entity.Film;
import forGodel.dao.model.FilmsDTO;

import java.util.ArrayList;
import java.util.List;

public class FilmConverter {


        public static FilmsDTO toDto(Film film){
            FilmsDTO filmDto = new FilmsDTO();
            filmDto.setFirstName(film.getDirector().getFirstName());
            filmDto.setLastName(film.getDirector().getLastName());
            filmDto.setBirthDate(film.getDirector().getBirth_date());
            filmDto.setFilmName(film.getFilmName());
            filmDto.setReleaseDate(film.getReleaseDate());
            filmDto.setGenre(film.getGenre());
            return filmDto;
        }


    public static List<FilmsDTO> allToDto(List<Film> films) {
        List<FilmsDTO> filmDtoList = new ArrayList<>();
        if (films.size() > 0) {
            films.forEach(film -> filmDtoList.add(FilmConverter.toDto(film)));
        }
        return filmDtoList;
    }

}
