//import forGodel.configuration.DaoConfig;
//import forGodel.dao.impl.FilmDao;
//import org.junit.jupiter.api.extension.ExtendWith;
//
//import org.junit.jupiter.api.Test;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.test.context.ContextConfiguration;
//import org.springframework.test.context.junit.jupiter.SpringExtension;
//
//
//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
//import java.time.LocalDate;
//import java.util.Scanner;
//
//import static org.junit.jupiter.api.Assertions.assertEquals;
//
//@ExtendWith(SpringExtension.class)
//@ContextConfiguration(classes = DaoConfig.class)
//public class TestForCinema {
//
//    @Autowired
//    private FilmDao filmDao ;
//
//    @Test
//    void getFilmsByDirector_Id() throws IOException {
//
//
//
//        Long num = 1L;
//        int size = filmDao.getFilmsByDirector_Id(num).size();
//        for (int i=0; i<size;i++){
//            System.out.println(filmDao.getFilmsByDirector_Id(num).get(i).getFirstName());
//            System.out.println(filmDao.getFilmsByDirector_Id(num).get(i).getLastName());
//            System.out.println(filmDao.getFilmsByDirector_Id(num).get(i).getFilmName());
//            System.out.println(filmDao.getFilmsByDirector_Id(num).get(i).getGenre());
//            System.out.println(filmDao.getFilmsByDirector_Id(num).get(i).getReleaseDate());
//        }
//
//        assertEquals(4, filmDao.getFilmsByDirector_Id(1L).size());
//        assertEquals(4, filmDao.getFilmsByDirector_Id(2L).size());
//        assertEquals(0, filmDao.getFilmsByDirector_Id(3L).size());
//        assertEquals(1, filmDao.getFilmsByDirector_Id(4L).size());
//    }
//
//
//    @Test
//    void getFilmsByReleaseDateIsGreaterThanEqual(){
//
//        LocalDate date = LocalDate.of(2000,11,11);
//
//        int size = filmDao.getFilmsByReleaseDateIsGreaterThanEqual(date).size();
//        for (int i=0; i<size;i++){
//            System.out.println(filmDao.getFilmsByReleaseDateIsGreaterThanEqual(date).get(i).getFirstName());
//            System.out.println(filmDao.getFilmsByReleaseDateIsGreaterThanEqual(date).get(i).getLastName());
//            System.out.println(filmDao.getFilmsByReleaseDateIsGreaterThanEqual(date).get(i).getFilmName());
//            System.out.println(filmDao.getFilmsByReleaseDateIsGreaterThanEqual(date).get(i).getGenre());
//            System.out.println(filmDao.getFilmsByReleaseDateIsGreaterThanEqual(date).get(i).getReleaseDate());
//        }
//
//        assertEquals(6,
//                     filmDao.getFilmsByReleaseDateIsGreaterThanEqual(date).size());
//
//
//    }
//
//
//
//    @Test
//    void getFilmsByDirector_IdAndReleaseDateIsGreaterThanEqual(){
//        assertEquals(2,
//                     filmDao.getFilmsByDirector_IdAndReleaseDateIsGreaterThanEqual(1L,
//                                                               LocalDate.of(2000,11,11)).size());
//    }
//
//
//
//
//}
