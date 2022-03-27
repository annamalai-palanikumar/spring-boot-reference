package in.annamalai.springbootreference.config;

import org.springdoc.core.GroupedOpenApi;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringFoxConfig {
  @Bean
  public GroupedOpenApi api() {
    return GroupedOpenApi.builder()
      .group("course-api").pathsToMatch("**")
      .build();
  }
}
