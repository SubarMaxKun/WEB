package com.shevliakov.service;

import com.shevliakov.Product;
import com.shevliakov.exceptions.ProductListIsEmptyException;
import junit.framework.TestCase;
import org.junit.Test;

public class CartServiceImplTest extends TestCase {

  public void testGetNewCart() {
    CartServiceImpl cartService = new CartServiceImpl();
    assertNotNull(cartService.getNewCart());
  }

  public void testAddProduct() {
    CartServiceImpl cartService = new CartServiceImpl();
    Product product = new Product(1L, "test", 12);
    cartService.addProduct(cartService.getNewCart(), product, 1);
    assertEquals(1, cartService.getProductQuantity(cartService.getNewCart(), product));
  }

  public void testTestAddProduct() {
    CartServiceImpl cartService = new CartServiceImpl();
    cartService.addProduct(cartService.getNewCart(), 1L, 1);
    assertEquals(1, cartService.getProductQuantity(cartService.getNewCart(), 1L));
  }

  public void testDelProduct() {
    CartServiceImpl cartService = new CartServiceImpl();
    Product product = new Product(1L, "test", 12);
    cartService.addProduct(cartService.getNewCart(), product, 1);
    cartService.delProduct(cartService.getNewCart(), product, 1);
    assertNull(cartService.getNewCart().getCartMap().get(product));
  }

  public void testGetSum() {
    CartServiceImpl cartService = new CartServiceImpl();
    Product product = new Product(1L, "test", 12);
    cartService.addProduct(cartService.getNewCart(), product, 1);
    assertNull(cartService.getSum(cartService.getNewCart()));
  }

  @Test(expected = ProductListIsEmptyException.class)
  public void testPrintCart() {
    CartServiceImpl cartService = new CartServiceImpl();
    cartService.printCart(cartService.getNewCart());
  }

  public void testGetProductQuantity() {
    CartServiceImpl cartService = new CartServiceImpl();
    Product product = new Product(1L, "test", 12);
    cartService.addProduct(cartService.getNewCart(), product, 1);
    assertEquals(1, cartService.getProductQuantity(cartService.getNewCart(), product));
  }

  public void testTestGetProductQuantity() {
    CartServiceImpl cartService = new CartServiceImpl();
    cartService.addProduct(cartService.getNewCart(), 1L, 1);
    assertEquals(1, cartService.getProductQuantity(cartService.getNewCart(), 1L));
  }
}