package com.kerz

import org.junit.Test
import org.junit.runner.RunWith
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.context.properties.EnableConfigurationProperties
import org.springframework.test.context.ContextConfiguration
import org.springframework.test.context.TestPropertySource
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner

import static org.junit.Assert.assertEquals

@RunWith(SpringJUnit4ClassRunner)
@ContextConfiguration(classes = [GroovyTestConfiguration])
@TestPropertySource('classpath:application.properties')
@EnableConfigurationProperties([GroovyTestConfiguration])
class GroovyTestConfigurationTest {

  @Autowired
  GroovyTestBean groovyTestBean

  @Test
  void shouldWork() throws Exception {
    assertEquals('groovy-test-bean', 'test-value',groovyTestBean.value)
  }
}
