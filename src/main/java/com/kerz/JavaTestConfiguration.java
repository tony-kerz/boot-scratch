package com.kerz;

import org.springframework.context.annotation.Configuration;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;

import javax.validation.constraints.NotNull;

@Configuration
@ConfigurationProperties(prefix="pre")
public class JavaTestConfiguration {

  @NotNull
  String testBeanValue;

  public String getTestBeanValue() {
    return testBeanValue;
  }

  public void setTestBeanValue(String testBeanValue) {
    this.testBeanValue = testBeanValue;
  }

  @Bean
  JavaTestBean testBean() {
    return new JavaTestBean(testBeanValue);
  }
}
