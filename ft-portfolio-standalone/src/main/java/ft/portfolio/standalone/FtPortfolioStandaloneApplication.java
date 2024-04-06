package ft.portfolio.standalone;

import ft.portfolio.infrastructure.BeanConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

@SpringBootApplication
@Import({
        BeanConfiguration.class,
})
public class FtPortfolioStandaloneApplication {

    public static void main(String[] args) {
        SpringApplication.run(FtPortfolioStandaloneApplication.class, args);
    }

}