package com.shevliakov.config;

import junit.framework.TestCase;
import org.junit.Test;
import org.junit.jupiter.api.DisplayName;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;

public class ApplicationConfigTest extends TestCase {
  @Order(1)
  @DisplayName("Config class is marked as @Configuration")
  public void testConfigClassIsMarkedAsConfiguration() {
    Configuration configuration = ApplicationConfig.class.getAnnotation(Configuration.class);

    assertNotNull(configuration);
  }

  @Order(2)
  @DisplayName("@ComponentScan is enabled")
  public void testComponentScanIsEnabled() {
    ComponentScan componentScan = ApplicationConfig.class.getAnnotation(ComponentScan.class);

    assertNotNull(componentScan);
  }
}