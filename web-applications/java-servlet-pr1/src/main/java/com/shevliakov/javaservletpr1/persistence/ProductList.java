package com.shevliakov.javaservletpr1.persistence;

public class ProductList {

  public static Product[] createProducts() {
    return new Product[]{
        new Product(1, "Burger", 100),
        new Product(2, "Sandwich", 15),
        new Product(12, "Cart", 124),
        new Product(22, "Makeup", 23),
        new Product(32, "Paperback", 21),
        new Product(23, "Paper", 16),
        new Product(22, "Ruller", 12),
        new Product(81, "Bill", 23),
        new Product(19, "Apple", 55),
        new Product(98, "Coke", 5),
        new Product(4, "Fanta", 2),
        new Product(128, "Pepsi", 12),
        new Product(112, "Lays", 65),
        new Product(16, "TUC", 12)};

  }
}

