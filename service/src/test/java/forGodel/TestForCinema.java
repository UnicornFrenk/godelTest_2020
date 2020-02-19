package forGodel;

import forGodel.dao.impl.FilmDao;
import forGodel.dao.model.FilmsDTO;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.junit.jupiter.MockitoSettings;
import org.mockito.quality.Strictness;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.when;

@MockitoSettings(strictness = Strictness.LENIENT)
@ExtendWith(MockitoExtension.class)
public class TestForCinema {


    @Mock
    FilmDao dao;

    @InjectMocks
    FilmServiceImpl service;

    @Test
    void getFilmsByDirector_Id() {

        when(dao.getFilmsByDirector_Id(1L)).thenReturn(new ArrayList<>());
        List<FilmsDTO> list = service.getFilmsByDirector_Id(1L);
        System.out.println(list);
        assertNotNull(list);

    }

    @Test
    void getFilmsByReleaseDateIsGreaterThanEqual() {
        when(dao.getFilmsByReleaseDateIsGreaterThanEqual(LocalDate.of(2000,11
                ,11))).thenReturn(new ArrayList<>());
        List<FilmsDTO> list =
                service.getFilmsByReleaseDateIsGreaterThanEqual(LocalDate.of(2000,11,11));
        System.out.println(list);
        assertNotNull(list);

    }

    @Test
    void getFilmsByDirector_IdAndReleaseDateIsGreaterThanEqual() {
        when(dao.getFilmsByDirector_IdAndReleaseDateIsGreaterThanEqual(2L,
                                                                       LocalDate.of(1900,11,11))).thenReturn(new ArrayList<>());
        List<FilmsDTO> list = service
                .getFilmsByDirector_IdAndReleaseDateIsGreaterThanEqual(2L,
                                                                       LocalDate
                                                                               .of(1900,
                                                                                   11,
                                                                                   11));
        System.out.println(list);
        assertNotNull(list);
    }

}
