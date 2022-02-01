package programmerzamannow.spring.core;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Import(value = {
    FooConfiguration.class,
    BarConfiguration.class
})
@Configuration
public class MainConfiguration {
}
