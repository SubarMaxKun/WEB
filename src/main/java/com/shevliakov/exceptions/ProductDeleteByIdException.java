package com.shevliakov.exceptions;

public class ProductDeleteByIdException extends RuntimeException{
  public ProductDeleteByIdException(String message) {
    super(message);
  }
}
