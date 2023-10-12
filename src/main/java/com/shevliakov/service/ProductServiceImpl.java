package com.shevliakov.service;

import com.shevliakov.Product;
import com.shevliakov.exceptions.ProductDeleteByIdException;
import com.shevliakov.exceptions.ProductFindByIdException;
import com.shevliakov.exceptions.ProductListIsEmptyException;
import com.shevliakov.exceptions.ProductUpdateOrSaveException;
import com.shevliakov.repository.ProductRepository;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceImpl implements ProductService {

  ProductRepository productRepository = new ProductRepository();

  @Override
  public List<Product> getProductList() {
    if (!productRepository.findAll().isEmpty()) {
      return productRepository.findAll();
    } else {
      throw new ProductListIsEmptyException("Product list is empty");
    }
  }

  @Override
  public void saveOrUpdate(Product product) {
    try {
      productRepository.saveOrUpdate(product);
    } catch (RuntimeException e) {
      throw new ProductUpdateOrSaveException("Product not saved");
    }
  }

  @Override
  public Product getProductById(Long id) {
    try {
      return productRepository.findById(id);
    } catch (RuntimeException e) {
      throw new ProductFindByIdException("Product not found");
    }
  }

  @Override
  public void deleteById(Long id) {
    try {
      productRepository.deleteById(id);
    } catch (RuntimeException e) {
      throw new ProductDeleteByIdException("Product not deleted by id");
    }
  }
}
