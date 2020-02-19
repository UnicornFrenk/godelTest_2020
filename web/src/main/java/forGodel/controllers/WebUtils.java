package forGodel.controllers;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Arrays;
import java.util.Optional;


public class WebUtils {


    public static void forword(String page, HttpServletRequest rq, HttpServletResponse rs) {
        try {
            rq.getRequestDispatcher("/" + page + ".jsp").forward(rq, rs);
        } catch (ServletException | IOException e) {
            throw new RuntimeException(e);
        }

    }


    public static void redirect(String page, HttpServletRequest req, HttpServletResponse resp) {
        try {
            resp.sendRedirect(req.getContextPath() + "/" + page);
        } catch (IOException e) {
            throw new RuntimeException();
        }
    }


    public static Optional<Cookie> findCookie(String cookieName, HttpServletRequest req) {
        Cookie[] cookies = req.getCookies();
        if (cookies != null) {
            return Arrays.stream(cookies)
                         .filter(c -> c.getName().equals(cookieName))
                         .findAny();
        } else {
            return Optional.empty();
        }
    }

}
