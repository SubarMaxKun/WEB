package com.shevliakov.exceptions;

public class ProductUpdateOrSaveException extends RuntimeException{

    public ProductUpdateOrSaveException(String message) {
      super(message);
    }
}
