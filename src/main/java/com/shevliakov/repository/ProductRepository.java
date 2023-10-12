package com.shevliakov.repository;

import com.shevliakov.Product;
import jakarta.annotation.PostConstruct;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.stereotype.Component;

@Component
public class ProductRepository {

  private static final Map<Long, Product> productMap = new HashMap<>();

  @PostConstruct
  public void init(){
    productMap.put(1L, new Product(1L, "Apple", 12));
    productMap.put(2L, new Product(2L, "Juice", 23));
    productMap.put(3L, new Product(3L, "Cheese", 11));
    productMap.put(4L, new Product(4L, "Bread", 5));
    productMap.put(5L, new Product(5L, "Milk", 7));
  }

  public List<Product> findAll() {
    return List.copyOf(productMap.values());
  }

  public void saveOrUpdate(Product product) {
    productMap.put(product.getId(), product);
  }

  public Product findById(Long id) {
    return productMap.get(id);
  }

  public void deleteById(Long id) {
    productMap.remove(id);
  }
}
