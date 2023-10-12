package com.shevliakov;

import java.util.HashMap;
import java.util.Map;
import org.springframework.stereotype.Component;

@Component
public class Cart {
  Map<Product, Integer> cartMap = new HashMap<>();

  public Map<Product, Integer> getCartMap() {
    return cartMap;
  }

  public void addProduct(Product product, Integer quantity) {
    cartMap.put(product, quantity);
  }

  public void delProduct(Product product, Integer quantity) {
    cartMap.remove(product);
  }

  public int getSum() {
    int sum = 0;
    for (Map.Entry<Product, Integer> entry : cartMap.entrySet()) {
      sum += entry.getKey().getPrice() * entry.getValue();
    }
    return sum;
  }
}
