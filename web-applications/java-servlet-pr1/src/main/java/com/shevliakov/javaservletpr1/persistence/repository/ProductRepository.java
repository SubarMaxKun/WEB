package com.shevliakov.javaservletpr1.persistence.repository;

import com.shevliakov.javaservletpr1.persistence.Product;

public interface ProductRepository {

  Product[] getAll(Product[] products);

  Product getById(int id, Product[] products);

  Product[] getByTitle(String title, Product[] products);
}
