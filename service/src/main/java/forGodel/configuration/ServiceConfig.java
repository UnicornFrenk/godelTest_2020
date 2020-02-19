package forGodel.configuration;

import forGodel.FilmService;
import forGodel.FilmServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ServiceConfig {

    private DaoConfig daoConfig;


    public ServiceConfig(DaoConfig daoConfig){
        this.daoConfig = daoConfig;
    }

    @Bean
    public FilmService filmService(){
        return new FilmServiceImpl(daoConfig.filmDao());
    }

}
