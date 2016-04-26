package com.kerz

import org.springframework.boot.context.properties.ConfigurationProperties
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

import javax.validation.constraints.NotNull

@Configuration
@ConfigurationProperties(prefix = 'pre')
class GroovyTestConfiguration {
  @NotNull
  String testBeanValue

  @Bean
  GroovyTestBean groovyTestBean() {
    new GroovyTestBean(testBeanValue)
  }
}
