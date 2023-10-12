package com.shevliakov;

import com.shevliakov.config.ApplicationConfig;
import com.shevliakov.service.ProductServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.NativeDetector.Context;

public class Main {

  public static void main(String[] args) {
    ApplicationContext context = initializeSpringContext();


  }
  private static ApplicationContext initializeSpringContext() {
    return new AnnotationConfigApplicationContext(ApplicationConfig.class);
  }
}
