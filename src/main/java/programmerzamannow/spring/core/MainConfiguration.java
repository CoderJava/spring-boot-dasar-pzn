package programmerzamannow.spring.core;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import programmerzamannow.spring.core.configuration.BarConfiguration;
import programmerzamannow.spring.core.configuration.FooConfiguration;

@Import(value = {
    FooConfiguration.class,
    BarConfiguration.class
})
@Configuration
public class MainConfiguration {
}
