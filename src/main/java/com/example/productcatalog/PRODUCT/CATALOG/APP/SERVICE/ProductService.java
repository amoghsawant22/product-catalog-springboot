package com.example.productcatalog.PRODUCT.CATALOG.APP.SERVICE;

import com.example.productcatalog.PRODUCT.CATALOG.APP.DTO.ProductDto;

import java.util.List;

public interface ProductService {

    ProductDto createProduct(ProductDto productDto);

    List<ProductDto> getAllProducts(int page , int size);

    ProductDto getById (Long id);

    ProductDto updateProduct(Long id,ProductDto productDto);

    ProductDto deleteProduct(Long id);
}
