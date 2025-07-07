package com.example.productcatalog.PRODUCT.CATALOG.APP.SERVICE.impl;

import com.example.productcatalog.PRODUCT.CATALOG.APP.DTO.ProductDto;
import com.example.productcatalog.PRODUCT.CATALOG.APP.ENTITY.Product;
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
