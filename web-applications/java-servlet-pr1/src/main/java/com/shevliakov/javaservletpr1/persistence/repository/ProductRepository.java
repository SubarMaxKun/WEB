package com.shevliakov.javaservletpr1.persistence.repository;

import com.shevliakov.javaservletpr1.persistence.Product;

public interface ProductRepository {

  Product[] getAll(Product[] products);

  String[] getTen(Product[] products);
}
