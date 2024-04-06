package ft.portfolio.infrastructure;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@EnableJpaRepositories(basePackages = "ft.portfolio.api")
@EntityScan("ft.portfolio.api")
public class JpaConfiguration {


}
