package com.kerz;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.assertEquals;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {JavaTestConfiguration.class})
@PropertySource("classpath:application.properties")
//@PropertySource("classpath:application.yml")
@EnableConfigurationProperties({JavaTestConfiguration.class})
public class JavaTestConfigurationTest {

  @Autowired
  JavaTestBean testBean;

  @Test
  public void shouldWork() throws Exception {
    assertEquals("testBean", "test-value", testBean.getValue());
  }
}
