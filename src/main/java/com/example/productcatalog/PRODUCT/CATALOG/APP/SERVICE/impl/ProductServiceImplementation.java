package com.example.productcatalog.PRODUCT.CATALOG.APP.SERVICE.impl;

import com.example.productcatalog.PRODUCT.CATALOG.APP.DTO.ProductDto;
import com.example.productcatalog.PRODUCT.CATALOG.APP.REPOSITORY.ProductRepository;
import com.example.productcatalog.PRODUCT.CATALOG.APP.SERVICE.ProductService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImplementation implements ProductService {

    private final ProductRepository productRepository;

    public ProductServiceImplementation(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public ProductDto createProduct(ProductDto productDto) {
        return null;
    }

    @Override
    public List<ProductDto> getAllProducts(int page, int size) {
        return List.of();
    }

    @Override
    public ProductDto getById(Long id) {
        return null;
    }

    @Override
    public ProductDto updateProduct(Long id, ProductDto productDto) {
        return null;
    }

    @Override
    public ProductDto deleteProduct(Long id) {
        return null;
    }
}
