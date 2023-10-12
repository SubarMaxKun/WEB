package com.shevliakov.service;

import com.shevliakov.Cart;
import com.shevliakov.Product;
import com.shevliakov.exceptions.ProductListIsEmptyException;
import java.math.BigDecimal;
import java.util.Map;


public class CartServiceImpl implements CartService{
  Cart cart = new Cart();
  ProductServiceImpl productService = new ProductServiceImpl();

  @Override
  public Cart getNewCart() {
    return cart;
  }

  @Override
  public void addProduct(Cart cart, Product product, Integer quantity) {
    try {
      if (product == null) {
        throw new NullPointerException();
      }
      if (quantity <= 0) {
        throw new IllegalArgumentException();
      }
      cart.addProduct(product, quantity);
    } catch (NullPointerException e) {
      System.out.println("Product is null");
    } catch (IllegalArgumentException e) {
      System.out.println("Quantity is less than 1");
    }
  }

  @Override
  public void addProduct(Cart cart, Long prodId, Integer quantity) {
    try{
      if (prodId == null) {
        throw new NullPointerException();
      }
      if (quantity <= 0) {
        throw new IllegalArgumentException();
      }
      Product product = productService.getProductById(prodId);
      cart.addProduct(product, quantity);
    } catch (NullPointerException e) {
      System.out.println("Product is null");
    } catch (IllegalArgumentException e) {
      System.out.println("Quantity is less than 1");
    }
  }

  @Override
  public void delProduct(Cart cart, Product product, Integer quantity) {
    try {
      if (product == null) {
        throw new NullPointerException();
      }
      if (quantity <= 0) {
        throw new IllegalArgumentException();
      }
      cart.delProduct(product, quantity);
    } catch (NullPointerException e) {
      System.out.println("Product is null");
    } catch (IllegalArgumentException e) {
      System.out.println("Quantity is less than 1");
    }
  }

  @Override
  public BigDecimal getSum(Cart cart) {
    return null;
  }

  @Override
  public void printCart(Cart cart) {
    try {
      if (cart.getCartMap().isEmpty()) {
        throw new ProductListIsEmptyException("Cart is empty");
      }
      for (Map.Entry<Product, Integer> entry : cart.getCartMap().entrySet()) {
        System.out.println(entry.getKey().getName() + " " + entry.getValue());
      }
    } catch (ProductListIsEmptyException e) {
      System.out.println("Cart is empty");
    }
  }

  @Override
  public int getProductQuantity(Cart cart, Product product) {
    try {
      if (product == null) {
        throw new NullPointerException();
      }
      return cart.getCartMap().get(product);
    } catch (NullPointerException e) {
      System.out.println("Product is null");
      return 0;
    }
  }

  @Override
  public int getProductQuantity(Cart cart, Long prodId) {
    try {
      if (prodId == null) {
        throw new NullPointerException();
      }
      Product product = productService.getProductById(prodId);
      return cart.getCartMap().get(product);
    } catch (NullPointerException e) {
      System.out.println("Product is null");
      return 0;
    }
  }
}
