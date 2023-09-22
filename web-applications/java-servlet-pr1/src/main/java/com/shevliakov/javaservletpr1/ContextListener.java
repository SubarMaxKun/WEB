package com.shevliakov.javaservletpr1;

import com.shevliakov.javaservletpr1.persistence.Product;
import com.shevliakov.javaservletpr1.persistence.ProductList;
import com.shevliakov.javaservletpr1.persistence.repository.ProductRepository;
import com.shevliakov.javaservletpr1.persistence.repository.ProductRepositoryImpl;
import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletContextEvent;
import jakarta.servlet.ServletContextListener;
import jakarta.servlet.annotation.WebListener;

@WebListener
public class ContextListener implements ServletContextListener {

  @Override
  public void contextInitialized(ServletContextEvent sce) {
    ServletContext context = sce.getServletContext();
    ProductRepositoryImpl productRepository = new ProductRepositoryImpl();
    String[] products = productRepository.getTen(ProductList.createProducts());
    context.setAttribute("products", products);
  }

  @Override
  public void contextDestroyed(ServletContextEvent sce) {
  }
}
