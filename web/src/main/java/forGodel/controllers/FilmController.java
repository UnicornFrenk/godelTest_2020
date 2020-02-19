package forGodel.controllers;

import forGodel.FilmService;
import forGodel.dao.model.FilmsDTO;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
@RequestMapping
public class FilmController {


    private FilmService filmService;

    public FilmController(FilmService filmService) {
        this.filmService = filmService;

    }


    @GetMapping("/films")
    public String helloPage(HttpSession session) {
        return "mainpage";
    }


    @GetMapping("/filmById")
    public String getFilmsById(HttpServletRequest request){
        return "filmById";
    }

    @PostMapping("/filmById")
    public String getFilmsByDirectorId(HttpServletRequest request) {
        Long id = Long.valueOf(request.getParameter("id"));
        List<FilmsDTO> films = filmService.getFilmsByDirector_Id(id);
        request.setAttribute("films", films);
        return "listFilmsById";
    }
}
