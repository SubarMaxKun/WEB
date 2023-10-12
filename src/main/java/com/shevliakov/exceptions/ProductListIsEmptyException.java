package com.shevliakov.exceptions;

public class ProductListIsEmptyException extends NullPointerException{
  public ProductListIsEmptyException(String errorMessage){
    super(errorMessage);
  }
}
