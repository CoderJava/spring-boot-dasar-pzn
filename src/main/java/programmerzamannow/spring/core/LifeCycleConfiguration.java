package programmerzamannow.spring.core;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import programmerzamannow.spring.core.data.Connection;
import programmerzamannow.spring.core.data.Server;

@Configuration
public class LifeCycleConfiguration {
  @Bean()
  public Connection connection() {
    return new Connection();
  }

  @Bean(initMethod = "start", destroyMethod = "stop")
  public Server server() {
    return new Server();
  }
}
