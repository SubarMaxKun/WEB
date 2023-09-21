package com.shevliakov.javaservletpr1.persistence.repository;

import com.shevliakov.javaservletpr1.persistence.Product;

public class ProductRepositoryImpl implements ProductRepository {

  @Override
  public Product[] getAll(Product[] products) {
    return products;
  }

  @Override
  public Product getById(int id, Product[] products) {
    for (Product product : products) {
      if (product.getId() == id) {
        return product;
      }
    }
    return null;
  }

  @Override
  public Product[] getByTitle(String title, Product[] products) {
    for (Product product : products) {
      if (product.getTitle().equals(title)) {
        return new Product[]{product};
      }
    }
    return new Product[0];
  }
}
