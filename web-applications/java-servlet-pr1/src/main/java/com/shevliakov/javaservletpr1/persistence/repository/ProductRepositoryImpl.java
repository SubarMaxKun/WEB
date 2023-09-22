package com.shevliakov.javaservletpr1.persistence.repository;

import com.shevliakov.javaservletpr1.persistence.Product;

public class ProductRepositoryImpl implements ProductRepository {

  @Override
  public Product[] getAll(Product[] products) {
    return products;
  }

  @Override
  public String[] getTen(Product[] products) {
    String[] titles = new String[10];
    for (int i = 0; i < 10; i++) {
      titles[i] = products[i].getTitle();
    }
    return titles;
  }
}
