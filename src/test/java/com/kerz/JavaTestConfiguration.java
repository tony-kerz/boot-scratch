package com.kerz;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.validation.constraints.NotNull;

@Configuration
@ConfigurationProperties(prefix="pre")
public class JavaTestConfiguration {

  public void setFoo(String foo) {
    this.foo = foo;
  }

  @NotNull
  String foo;

  @Bean
  String foo() {
    return foo;
  }
}
