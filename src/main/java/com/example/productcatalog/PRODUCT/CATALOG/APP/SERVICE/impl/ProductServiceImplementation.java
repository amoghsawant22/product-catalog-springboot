package com.example.productcatalog.PRODUCT.CATALOG.APP.SERVICE.impl;

import com.example.productcatalog.PRODUCT.CATALOG.APP.DTO.ProductDto;
import com.example.productcatalog.PRODUCT.CATALOG.APP.ENTITY.Product;
import com.example.productcatalog.PRODUCT.CATALOG.APP.REPOSITORY.ProductRepository;
import com.example.productcatalog.PRODUCT.CATALOG.APP.SERVICE.ProductService;
import exception.ResourceNotFoundException;
import org.springframework.boot.context.config.ConfigDataResourceNotFoundException;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;

import org.springframework.stereotype.Service;


import java.util.List;



@Service
public class ProductServiceImplementation implements ProductService {

    private final ProductRepository productRepository;

    public ProductServiceImplementation(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    private ProductDto mapToDto(Product product) {
        return new ProductDto(
                product.getId(),
                product.getName(),
                product.getCategory(),
                product.getPrice()
        );
    }

    private Product mapToEntity(ProductDto dto) {
        return new Product(
                dto.getName(),
                dto.getCategory(),
                dto.getPrice()
        );
    }


    @Override
    public ProductDto createProduct(ProductDto dto) {
        Product product =  mapToEntity(dto);
        Product savedProduct = productRepository.saveAndFlush(product);
        return mapToDto(savedProduct);
    }

    @Override
    public List<ProductDto> getAllProducts(int page, int size) {
        Pageable pageable = PageRequest.of(page,size);
        Page<Product> productsPage = productRepository.findAll(pageable);
        List<Product> products =  productsPage.getContent();

        return products.stream()
                .map(this::mapToDto)
                .toList();
    }

    @Override
    public ProductDto getById(Long id) {
        Product product = productRepository.findById(id)
        .orElseThrow(()-> new ResourceNotFoundException("Product not found with id:" +id));
        return  mapToDto(product);
    }

    @Override
    public ProductDto updateProduct(Long id, ProductDto dto) {
        Product product = productRepository.findById(id)
                .orElseThrow(()-> new ResourceNotFoundException("product not found with the id"+id));
        product.setCategory(dto.getCategory());
        product.setName(dto.getName());
        product.setPrice(dto.getPrice());

        Product updatedProduct = productRepository.saveAndFlush(product);
        return mapToDto(updatedProduct);
    }

    @Override
    public ProductDto deleteProduct(Long id) {
        return null;
    }
}
