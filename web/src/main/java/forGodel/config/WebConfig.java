package forGodel.config;

import forGodel.configuration.ServiceConfig;
import forGodel.controllers.FilmController;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.JstlView;
import org.springframework.web.servlet.view.UrlBasedViewResolver;


@Configuration
@EnableWebMvc
public class WebConfig {


    private ServiceConfig serviceConfig;

    public WebConfig(ServiceConfig serviceConfig) {
        this.serviceConfig = serviceConfig;
    }

    @Bean
    public FilmController filmController() {
        return new FilmController(serviceConfig.filmService());
    }

    @Bean
    public UrlBasedViewResolver urlBasedViewResolver() {
        UrlBasedViewResolver resolver = new UrlBasedViewResolver();
        resolver.setPrefix("/WEB-INF/");
        resolver.setSuffix(".jsp");
        resolver.setCache(false);
        resolver.setViewClass(JstlView.class);
        return resolver;
    }
}
