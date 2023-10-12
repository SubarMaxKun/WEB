package com.shevliakov.exceptions;

public class ProductFindByIdException extends RuntimeException{

    public ProductFindByIdException(String message) {
      super(message);
    }
}
