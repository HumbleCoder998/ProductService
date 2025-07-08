package com.practice.ProductService.controllers;

import com.practice.ProductService.dtos.GenericProductDto;
import com.practice.ProductService.exceptions.NotFoundException;
import com.practice.ProductService.services.ProductService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/products")
public class ProductController {

    private ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping
    public List<GenericProductDto> getAllProducts()
    {
     return productService.getAllProducts();
    }

    @GetMapping("{id}")
    public GenericProductDto getProductById(@PathVariable("id") Long id)throws NotFoundException
    {
        return productService.getProductById(id);
    }

    @DeleteMapping
    public void deleteProductById(){

    }

    @PostMapping
    public GenericProductDto createProduct(@RequestBody GenericProductDto product)
    {
        return productService.createProduct(product);
    }

    @PutMapping("{id}")
    public void updateProductById()
    {

    }

    @DeleteMapping("{id}")
    public ResponseEntity<GenericProductDto> deleteProductById(@PathVariable("id") Long id)
    {
        return new ResponseEntity<>(productService.deleteProduct(id), HttpStatus.OK);
    }
}
