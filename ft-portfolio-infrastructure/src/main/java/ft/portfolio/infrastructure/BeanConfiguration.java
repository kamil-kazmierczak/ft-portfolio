package ft.portfolio.infrastructure;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import({
        JpaConfiguration.class,
        InfrastructureConfiguration.class,
        EndpointsConfiguration.class
})
public class BeanConfiguration {


}
