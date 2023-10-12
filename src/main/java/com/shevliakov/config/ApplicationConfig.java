package com.shevliakov.config;

import com.shevliakov.Cart;
import com.shevliakov.repository.ProductRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
@ComponentScan("com.shevliakov")
public class ApplicationConfig {

  @Bean
  public ProductRepository productRepository() {
    return new ProductRepository();
  }

  @Bean
  @Scope("prototype")
  public Cart cart() {
    return new Cart();
  }
}
