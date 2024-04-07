package ft.portfolio.infrastructure;

import ft.portfolio.application.PortfolioController;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class EndpointsConfiguration {

    @Bean
    public PortfolioController portfolioController() {
        return new PortfolioController();
    }

}
