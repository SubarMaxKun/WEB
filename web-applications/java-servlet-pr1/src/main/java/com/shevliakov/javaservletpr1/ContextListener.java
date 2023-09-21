package com.shevliakov.javaservletpr1;

import com.shevliakov.javaservletpr1.persistence.Product;
import com.shevliakov.javaservletpr1.persistence.ProductList;
import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletContextEvent;
import jakarta.servlet.ServletContextListener;
import jakarta.servlet.annotation.WebListener;

@WebListener
public class ContextListener implements ServletContextListener {

  @Override
  public void contextInitialized(ServletContextEvent sce) {
    ServletContext context = sce.getServletContext();
    ProductList productList = new ProductList();
    Product[] products = productList.createProducts();
    context.setAttribute("products", products);
  }

  @Override
  public void contextDestroyed(ServletContextEvent sce) {
  }
}
