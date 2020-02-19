package forGodel.configuration;

import forGodel.dao.FilmDaoImpl;
import forGodel.dao.impl.FilmDao;
import forGodel.dao.repositoryJPA.FilmRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@Import(HibernateConfig.class)
@EnableJpaRepositories(basePackages = "forGodel.dao.repositoryJPA")
@EnableTransactionManagement

public class DaoConfig {

    @Autowired
    private FilmRepository filmRepository;


    @Bean
    public FilmDao filmDao(){
        return new FilmDaoImpl(filmRepository);
    }
}
