package com.shevliakov.service;

import com.shevliakov.Product;
import com.shevliakov.config.ApplicationConfig;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ProductServiceImplTest {

  @Test
  public void testGetProductList() {
    ProductServiceImpl productService = new ProductServiceImpl();
    Assert.assertFalse(productService.getProductList().isEmpty());
  }

  @Test
  public void testSaveOrUpdate() {
    ProductServiceImpl productService = new ProductServiceImpl();
    productService.saveOrUpdate(new Product(6L, "Test", 100));
    Assert.assertEquals(productService.getProductById(6L).getName(), "Test");

  }

  @Test
  public void testGetProductById() {
    ProductServiceImpl productService = new ProductServiceImpl();
    Assert.assertEquals(productService.getProductById(1L).getName(), "Apple");
  }

  @Test
  public void testDeleteById() {
    ProductServiceImpl productService = new ProductServiceImpl();
    productService.deleteById(1L);
    Assert.assertNull(productService.getProductById(1L));
  }

  @Before
  public void initializeSpringContext() {
    ApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfig.class);
  }
}