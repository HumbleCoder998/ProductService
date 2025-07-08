package com.practice.ProductService.services;

import com.practice.ProductService.dtos.GenericProductDto;
import com.practice.ProductService.exceptions.NotFoundException;

import java.util.List;

public interface ProductService {

    GenericProductDto getProductById(Long id) throws NotFoundException;

    GenericProductDto createProduct(GenericProductDto product);

    List<GenericProductDto> getAllProducts();

    GenericProductDto deleteProduct(Long id);
}
